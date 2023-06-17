package com.easyparking.app.rest.Repository;

import com.easyparking.app.rest.Model.Calificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICalificacionRepo extends JpaRepository <Calificacion, Long> {

    @Query(" SELECT c FROM Calificacion c WHERE c.IdUsuarioFk = :idUsuario ")
    List<Calificacion> findByUsuario (int idUsuario);

    @Query(" SELECT c FROM Calificacion c WHERE c.IdParqueaderoFkId = :idParqueadero ")
    List<Calificacion> findByParqueadero (int idParqueadero);
}
