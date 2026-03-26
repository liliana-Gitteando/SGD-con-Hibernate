package com.myweb.mavenproject1.dao;

import com.myweb.mavenproject1.entidades.Documento;
import com.myweb.mavenproject1.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

/**
 * Clase DAO para operaciones CRUD de Documento
 */
public class DocumentoDAO {

    /**
     * Guardar
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
     /**
     *  Listar 
     */
    public List<Documento> listar() {

        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Documento> lista = null;

        try {
            lista = session.createQuery("FROM Documento", Documento.class).list();
        } catch (Exception e) {
            System.out.println("Error al listar documentos");
            e.printStackTrace();
        } finally {
            session.close();
    }

     return lista;
    }

    //  ACTUALIZAR
    public void actualizar(Documento documento) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        try {
            session.update(documento);
            tx.commit();
            System.out.println("Documento actualizado correctamente");
        } catch (Exception e) {
            tx.rollback();
            System.out.println("Error al actualizar documento");
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}

