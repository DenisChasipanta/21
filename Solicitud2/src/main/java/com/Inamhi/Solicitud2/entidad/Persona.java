package com.Inamhi.Solicitud2.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
@Data
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigo;
    private String nombreDelFuncionario;
    private String direccion;
    private String email;
    private String tipoRegistro;
    private LocalDate fecha;
    private String tipoEquipo;
    private String sistemaOperativo;
    private String procesador;
    private String tipoDisco;
    private String ram;
    private String CapacidadDisco;
    private String marca;
    private String modelo;
    private String serie;
    private String estado;
    private String observacion;
    private String cableMonitor;
    private String touchpad;
    private String lector;
    private String lectorTarjetas;
    private String puertoEthernet;
    private String puertoHDMI;
    private String puertoVGA;
    private String indicadoresLuminosos;
    private String salidadAudio;
    private String wifi;
    private String mentenimiento;
    private String revisado;
    private String recibido;
    private String cargo;
}
