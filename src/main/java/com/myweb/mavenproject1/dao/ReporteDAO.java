package com.myweb.mavenproject1.dao;

import com.myweb.mavenproject1.entidades.Reporte;
import com.myweb.mavenproject1.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class ReporteDAO {

    public void guardar(Reporte r) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.save(r);
            tx.commit();
            System.out.println("Reporte guardado exitosamente");
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
            System.err.println("Error al guardar reporte: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public List<Reporte> listar() {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            List<Reporte> lista = session.createQuery("FROM Reporte", Reporte.class).list();
            return lista;
        } catch (Exception ex) {
            System.err.println("Error al listar reportes: " + ex.getMessage());
            ex.printStackTrace();
            return null;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public Reporte obtenerPorId(int id) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Reporte reporte = session.get(Reporte.class, id);
            return reporte;
        } catch (Exception ex) {
            System.err.println("Error al obtener reporte: " + ex.getMessage());
            ex.printStackTrace();
            return null;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public void actualizar(Reporte r) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();
            session.update(r);
            tx.commit();
            System.out.println("Reporte actualizado exitosamente");
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
            System.err.println("Error al actualizar reporte: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public void eliminar(int id) {
        Session session = null;
        Transaction tx = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tx = session.beginTransaction();

            Reporte r = session.get(Reporte.class, id);
            if (r != null) {
                session.delete(r);
                System.out.println("Reporte eliminado exitosamente");
            } else {
                System.out.println("Reporte no encontrado");
            }

            tx.commit();
        } catch (Exception ex) {
            if (tx != null) {
                tx.rollback();
            }
            System.err.println("Error al eliminar reporte: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}

