package com.myweb.mavenproject1;

import org.hibernate.Session;

public class Main {

    public static void main(String[] args) {

        System.out.println("Intentando conectar...");

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            System.out.println("Conexión exitosa a la BD");
            session.close();
        } catch (Exception e) {
            System.out.println("Error de conexión:");
            e.printStackTrace();
        }
    }
}