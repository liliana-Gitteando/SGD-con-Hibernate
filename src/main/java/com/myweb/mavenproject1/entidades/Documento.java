package com.myweb.mavenproject1.entidades;

import javax.persistence.*;
import java.util.Date;

/**
 * Entidad que representa la tabla documento
 */
@Entity
@Table(name = "documento")
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "numero_radicado")
    private String numeroRadicado;

    @Column(name = "tipo_documento")
    private String tipoDocumento;

    private String asunto;
    private String remitente;
    private String destinatario;

    @Column(name = "fecha_radicacion")
    @Temporal(TemporalType.DATE)
    private Date fechaRadicacion;

    @Column(name = "fecha_vencimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaVencimiento;

    private String estado;

    @Column(name = "usuario_id")
    private int usuarioId;

    private String dependencia;
    private String observaciones;

    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    // Constructor vacío obligatorio
    public Documento() {
    }

    // Getters y Setters
}