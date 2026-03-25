package com.myweb.mavenproject1.dao;

import com.myweb.mavenproject1.entidades.Documento;
import com.myweb.mavenproject1.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Clase DAO para operaciones CRUD de Documento
 */
public class DocumentoDAO {

    /**
     * Método para guardar un documento en la base de datos
     */
    public void guardar(Documento documento) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        try {
            session.save(documento);
            tx.commit();
            System.out.println("Documento guardado correctamente");
        } catch (Exception e) {
            tx.rollback();
            System.out.println("Error al guardar documento");
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}