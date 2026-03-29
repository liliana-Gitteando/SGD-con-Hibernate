package com.myweb.mavenproject1.dao;

import com.myweb.mavenproject1.entidades.Alertas;
import com.myweb.mavenproject1.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import java.util.List;

public class AlertasDAO {
    
    /**
    * Guardar una alerta
    */
    public void saveAlerta(Alertas alerta) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(alerta);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }

    /**
    * Obtener todas las alertas
    */
    public List<Alertas> getAlertas() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query<Alertas> query = session.createQuery("FROM Alertas", Alertas.class);
            return query.list();
        }
    }
    // Método para listar todas las alertas
            
    public List<Alertas> listarAlertas() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Alertas> lista = session.createQuery("FROM Alertas", Alertas.class).list();
        session.close();
        return lista;
    }
}