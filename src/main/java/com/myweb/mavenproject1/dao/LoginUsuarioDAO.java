package com.myweb.mavenproject1.dao;

import com.myweb.mavenproject1.entidades.LoginUsuario;
import com.myweb.mavenproject1.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class LoginUsuarioDAO {

    public void guardar(LoginUsuario usuario) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        try {
            session.save(usuario);
            tx.commit();
            System.out.println("Usuario guardado");
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public List<LoginUsuario> listar() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<LoginUsuario> lista = session.createQuery("FROM LoginUsuario", LoginUsuario.class).list();
        session.close();
        return lista;
        }
        
    public void actualizar(LoginUsuario usuario) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        try {
            session.update(usuario);
            tx.commit();
            System.out.println("Usuario actualizado");
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}