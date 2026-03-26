package com.myweb.mavenproject1;

import com.myweb.mavenproject1.dao.DocumentoDAO; 
import com.myweb.mavenproject1.entidades.Documento;
import java.util.Date;
import java.util.List;
import com.myweb.mavenproject1.dao.LoginUsuarioDAO;
import com.myweb.mavenproject1.entidades.LoginUsuario;


public class Main {

    public static void main(String[] args) {

        DocumentoDAO dao = new DocumentoDAO();

        //  Método para guardar un doumento en la base de datos 
        
        Documento doc = new Documento();
        doc.setNumeroRadicado("RAD-E-2026-25-00033");
        doc.setTipoDocumento("Comuncación de Entrada");
        doc.setAsunto("Prueba Hibernate 2");
        doc.setRemitente("Empresa A");
        doc.setDestinatario("Empresa B");
        doc.setFechaRadicacion(new Date());
        doc.setFechaVencimiento(new Date());
        doc.setEstado("Devuelto");
        doc.setUsuarioId(1);
        doc.setDependencia("Contabilidad");
        doc.setObservaciones("Corrección de nómina");
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
        
        // Método pata listar usuarios
        
        LoginUsuarioDAO daoUsuario = new LoginUsuarioDAO();

        LoginUsuario user = new LoginUsuario();
        user.setNombre("Roberto Montes");
        user.setContraseña("2327690");
        user.setRol("Funcionario2");

        daoUsuario.guardar(user);
        
        List<LoginUsuario> usuarios = daoUsuario.listar();

        for (LoginUsuario u : usuarios) {
            System.out.println("ID: " + u.getId());
            System.out.println("Nombre: " + u.getNombre());
            System.out.println("Rol: " + u.getRol());
            System.out.println("------------------------");
        }  

    }
}