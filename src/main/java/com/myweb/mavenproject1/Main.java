package com.myweb.mavenproject1;

import org.hibernate.Session;

public class Main {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        if (session != null) {
            System.out.println("Conexión exitosa");
        } else {
            System.out.println("Error de conexión");
        }

        session.close();
    }
}