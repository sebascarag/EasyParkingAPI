package com.easyparking.app.rest.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class users_usuario {
    @Id
    @Column
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    @Column
    private String nombre_usu;

    @Column
    private String apellido;

    @Column
    private String cedula;

    @Column
    private String email_usu;

    @Column
    private String tel_usu;

    @Column
    private String contrasenna;

    @Column
    private LocalDateTime last_login;

    @Column
    private String password;

    @Column
    private Long id_rol_fk_id;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_usu() {
        return nombre_usu;
    }

    public void setNombre_usu(String nombre_usu) {
        this.nombre_usu = nombre_usu;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail_usu() {
        return email_usu;
    }

    public void setEmail_usu(String email_usu) {
        this.email_usu = email_usu;
    }

    public String getTel_usu() {
        return tel_usu;
    }

    public void setTel_usu(String tel_usu) {
        this.tel_usu = tel_usu;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public LocalDateTime getLast_login() {
        return last_login;
    }

    public void setLast_login(LocalDateTime last_login) {
        this.last_login = last_login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId_rol_fk_id() {
        return id_rol_fk_id;
    }

    public void setId_rol_fk_id(Long id_rol_fk_id) {
        this.id_rol_fk_id = id_rol_fk_id;
    }
}
