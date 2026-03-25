package com.myweb.mavenproject1;

import com.myweb.mavenproject1.dao.DocumentoDAO; 
import com.myweb.mavenproject1.entidades.Documento;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        DocumentoDAO dao = new DocumentoDAO();

        //  Método para guardar un doumento en la base de datos 
        
        Documento doc = new Documento();
        doc.setNumeroRadicado("RAD-002");
        doc.setTipoDocumento("Oficio");
        doc.setAsunto("Prueba Hibernate 2");
        doc.setRemitente("Empresa A");
        doc.setDestinatario("Empresa B");
        doc.setFechaRadicacion(new Date());
        doc.setFechaVencimiento(new Date());
        doc.setEstado("A");
        doc.setUsuarioId(1);
        doc.setDependencia("Archivo");
        doc.setObservaciones("Documento de prueba");
        doc.setFechaCreacion(new Date());

        dao.guardar(doc);

        // Método pata listar documentos
        
        List<Documento> documentos = dao.listar();

        for (Documento d : documentos) {
            System.out.println("ID: " + d.getId());
            System.out.println("Radicado: " + d.getNumeroRadicado());
            System.out.println("Asunto: " + d.getAsunto());
            System.out.println("------------------------");
        }
    }
}

