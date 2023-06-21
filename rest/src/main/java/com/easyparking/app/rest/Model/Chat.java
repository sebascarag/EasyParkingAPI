package com.easyparking.app.rest.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Chat {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private LocalDateTime fechaHora;

    @ManyToOne
    @JoinColumn(name = "idUsuarioFrom")
    private  users_usuario idUsuarioFrom;

    @ManyToOne
    @JoinColumn(name = "idUsuarioTo")
    private  users_usuario idUsuarioTo;

    @Column
    private String mensaje;

    @ManyToOne
    @JoinColumn(name = "idReserva")
    private reserva idReserva;

    @Column
    private boolean pertenece;

    @Column
    private LocalDateTime visualizacion;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public users_usuario getIdUsuarioFrom() {
        return idUsuarioFrom;
    }

    public void setIdUsuarioFrom(users_usuario idUsuarioFrom) {
        this.idUsuarioFrom = idUsuarioFrom;
    }

    public users_usuario getIdUsuarioTo() {
        return idUsuarioTo;
    }

    public void setIdUsuarioTo(users_usuario idUsuarioTo) {
        this.idUsuarioTo = idUsuarioTo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public reserva getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(reserva idReserva) {
        this.idReserva = idReserva;
    }

    public boolean isPertenece() {
        return pertenece;
    }

    public void setPertenece(boolean pertenece) {
        this.pertenece = pertenece;
    }

    public LocalDateTime getVisualizacion() {
        return visualizacion;
    }

    public void setVisualizacion(LocalDateTime visualizacion) {
        this.visualizacion = visualizacion;
    }
}
