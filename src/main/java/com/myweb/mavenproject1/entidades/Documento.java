package com.myweb.mavenproject1.entidades;

import javax.persistence.*;
import java.util.Date;

/**
 * Entidad que representa la tabla documento
 */
@Entity
@Table(name = "documentos")
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
   @Temporal(TemporalType.TIMESTAMP)
   private Date fechaRadicacion;

    @Column(name = "fecha_vencimiento")
    @Temporal(TemporalType.TIMESTAMP)
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumeroRadicado() {
        return numeroRadicado;
    }

    public void setNumeroRadicado(String numeroRadicado) {
        this.numeroRadicado = numeroRadicado;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public Date getFechaRadicacion() {
        return fechaRadicacion;
    }

    public void setFechaRadicacion(Date fechaRadicacion) {
        this.fechaRadicacion = fechaRadicacion;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
}