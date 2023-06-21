package com.easyparking.app.rest.Controller;

import com.easyparking.app.rest.Model.Chat;
import com.easyparking.app.rest.Repository.IChatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class ChatController {

    @Autowired
    private IChatRepo _chatRepo;

    @GetMapping(value = "/chat")
    public List<Chat> getChat(){
        return _chatRepo.findAll();
    }

    @GetMapping(value = "/chat/{id}")
    public List<Chat> getChat(@PathVariable int id){
        return _chatRepo.findByReserva(id);
    }

    @PostMapping(value = "/savechat")
    public String saveChat(@RequestBody Chat chat) throws Exception {

        if (chat == null) {
            throw new Exception("No se pueden enviar mensajes vacios");
        }

        if (chat.getId()!=null){
            throw new Exception("Error");
        }

        if (chat.getMensaje()==null || chat.getMensaje().isEmpty()){
            throw new Exception("Mensaje vacio");
        }

        if (chat.getIdReserva().getID() <= 0) {
            throw new Exception("Reserva no válido");
        }
        if (chat.getIdUsuarioFrom().getId() <= 0 || chat.getIdUsuarioTo().getId() <= 0) {
            throw new Exception("Usuario no válido");
        }
        chat.setFechaHora(LocalDateTime.now());
        _chatRepo.save(chat);
            return "Mensaje enviado";
    }

}
