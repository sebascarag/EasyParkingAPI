package com.easyparking.app.rest.Controller;

import com.easyparking.app.rest.Model.Calificacion;
import com.easyparking.app.rest.Repository.ICalificacionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class CalificacionController {

    @Autowired
    private ICalificacionRepo _repo;

    @GetMapping(value = "/comment")
    public List<Calificacion> getCalificaciones(){
        return _repo.findAll();
    }

    @GetMapping(value = "/misopiniones/{id}")
    public List<Calificacion> getOpiniones(@PathVariable int id){
        return _repo.findByUsuario(id);
    }

    @GetMapping(value = "/calificacionesParqueadero/{id}")
    public List<Calificacion> getCalificaciones(@PathVariable int id){
        return _repo.findByParqueadero(id);
    }

    @PostMapping(value="/savecomment")
    public String saveComment(@RequestBody Calificacion calificacion) throws Exception {

    if (calificacion==null ){
        throw new Exception("La calificación no puede ser vacía");
    }
    if (calificacion.getCantidadEstrellas()<0 || calificacion.getCantidadEstrellas()>5){
        throw new Exception("Cantidad de estrellas no válida");
    }
    if (calificacion.getIdParqueaderoFkId()<=0){
        throw new Exception("Parqueadero no válido");
    }
    if(calificacion.getIdUsuarioFk()<=0){
        throw new Exception("Usuario no válido");
    }
    calificacion.setFechaHora(LocalDateTime.now());
    _repo.save(calificacion);
        return "Calificacion guaradada";
    }

    @PutMapping(value="/updatecomment/{Id}")
    public String updateComment(@PathVariable long Id, @RequestBody Calificacion calificacion) throws Exception {

        if (calificacion==null ){
            throw new Exception("La calificación no puede ser vacía");
        }
        if (calificacion.getCantidadEstrellas()<0 || calificacion.getCantidadEstrellas()>5){
            throw new Exception("Cantidad de estrellas no válida");
        }
        Calificacion updateComment = _repo.findById(Id).get();
        if (updateComment == null){
            throw new Exception("No se encontró la calificación");
        }
        updateComment.setCantidadEstrellas(calificacion.getCantidadEstrellas());
        updateComment.setFechaHora(LocalDateTime.now());
        updateComment.setComentarios(calificacion.getComentarios());
        _repo.save(updateComment);
        return "Actualizado";

    }

    @DeleteMapping(value = "/deletecomment/{id}")
    public String deleteComment(@PathVariable long id){
        Calificacion deleteComment = _repo.findById(id).get();
        _repo.delete(deleteComment);
        return "Comentario eliminado";
    }
}
