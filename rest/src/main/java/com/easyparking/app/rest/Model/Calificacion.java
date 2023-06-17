package com.easyparking.app.rest.Model;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Calificacion {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int Id;

    @Column(name="CANTIDAD_ESTRELLAS")
    private int CantidadEstrellas;

    @Column(name="COMENTARIOS")
    private String Comentarios;

    @Column(name = "FECHA_HORA")
    private LocalDateTime FechaHora;

    @Column (name = "ID_USUARIO_FK_ID")
    private int IdUsuarioFk;

    @Column (name = "ID_PARQUEADERO_FK_ID")
    private int IdParqueaderoFkId;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id= Id;
    }

    public int getCantidadEstrellas() {
        return CantidadEstrellas;
    }

    public void setCantidadEstrellas(int CantidadEstrellas) {
        this.CantidadEstrellas = CantidadEstrellas;
    }

    public String getComentarios() {
        return Comentarios;
    }

    public void setComentarios(String Comentarios) {
        this.Comentarios = Comentarios;
    }

    public LocalDateTime getFechaHora() {
        return FechaHora;
    }

    public void setFechaHora(LocalDateTime FechaHora) {
        this.FechaHora = FechaHora;
    }

    public int getIdUsuarioFk() {
        return IdUsuarioFk;
    }

    public void setIdUsuarioFk(int IdUsuarioFk) {
        this.IdUsuarioFk = IdUsuarioFk;
    }

    public int getIdParqueaderoFkId() {
        return IdParqueaderoFkId;
    }

    public void setIdParqueaderoFkId(int IdParqueaderoFkId) {
        this.IdParqueaderoFkId = IdParqueaderoFkId;
    }
}
