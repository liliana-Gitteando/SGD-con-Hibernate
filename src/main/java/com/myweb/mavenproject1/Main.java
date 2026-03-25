package com.myweb.mavenproject1;

import com.myweb.mavenproject1.dao.DocumentoDAO;
import com.myweb.mavenproject1.entidades.Documento;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        DocumentoDAO dao = new DocumentoDAO();

        Documento doc = new Documento();
        doc.setNumeroRadicado("RAD-001");
        doc.setTipoDocumento("Oficio");
        doc.setAsunto("Prueba Hibernate");
        doc.setRemitente("Empresa A");
        doc.setDestinatario("Empresa B");
        doc.setFechaRadicacion(new Date());
        doc.setFechaVencimiento(new Date());
        doc.setEstado("Activo");
        doc.setUsuarioId(1);
        doc.setDependencia("Archivo");
        doc.setObservaciones("Documento de prueba");
        doc.setFechaCreacion(new Date());

        dao.guardar(doc);
    }
}