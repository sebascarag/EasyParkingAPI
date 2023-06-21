package com.easyparking.app.rest.Repository;

import com.easyparking.app.rest.Model.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IChatRepo extends JpaRepository <Chat, Long > {

    @Query("SELECT c FROM Chat c where c.idReserva.id = :ID")
    List<Chat> findByReserva(int ID);


}
