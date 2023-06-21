package com.easyparking.app.rest.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class reserva {
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY )
    private int ID;

    @Column
    private String TIPO_RESERVA;

    @Column
    private String PLACA_VEH;

    @Column
    private int CANTIDAD_RESERVA;

    @Column
    private LocalDateTime FECHA_HORA;

    @Column
    private int ID_USUARIO_FK_ID;

    @Column
    private int  ID_PARQUEADERO_FK_ID;

    @Column
    private int ID_ESTADO_FK_ID;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTIPO_RESERVA() {
        return TIPO_RESERVA;
    }

    public void setTIPO_RESERVA(String TIPO_RESERVA) {
        this.TIPO_RESERVA = TIPO_RESERVA;
    }

    public String getPLACA_VEH() {
        return PLACA_VEH;
    }

    public void setPLACA_VEH(String PLACA_VEH) {
        this.PLACA_VEH = PLACA_VEH;
    }

    public int getCANTIDAD_RESERVA() {
        return CANTIDAD_RESERVA;
    }

    public void setCANTIDAD_RESERVA(int CANTIDAD_RESERVA) {
        this.CANTIDAD_RESERVA = CANTIDAD_RESERVA;
    }

    public LocalDateTime getFECHA_HORA() {
        return FECHA_HORA;
    }

    public void setFECHA_HORA(LocalDateTime FECHA_HORA) {
        this.FECHA_HORA = FECHA_HORA;
    }

    public int getID_USUARIO_FK_ID() {
        return ID_USUARIO_FK_ID;
    }

    public void setID_USUARIO_FK_ID(int ID_USUARIO_FK_ID) {
        this.ID_USUARIO_FK_ID = ID_USUARIO_FK_ID;
    }

    public int getID_PARQUEADERO_FK_ID() {
        return ID_PARQUEADERO_FK_ID;
    }

    public void setID_PARQUEADERO_FK_ID(int ID_PARQUEADERO_FK_ID) {
        this.ID_PARQUEADERO_FK_ID = ID_PARQUEADERO_FK_ID;
    }

    public int getID_ESTADO_FK_ID() {
        return ID_ESTADO_FK_ID;
    }

    public void setID_ESTADO_FK_ID(int ID_ESTADO_FK_ID) {
        this.ID_ESTADO_FK_ID = ID_ESTADO_FK_ID;
    }
}
