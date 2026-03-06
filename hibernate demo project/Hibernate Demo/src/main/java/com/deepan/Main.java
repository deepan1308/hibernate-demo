package com.deepan;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Alien a = new Alien();
       a.setAid(101);
       a.setAname("deepan");
       a.setAtech("Computer science");

        Configuration config = new Configuration();

        config.addAnnotatedClass(com.deepan.Alien.class);

        config.configure("hibernate.cfg.xml");
        SessionFactory factory = config.buildSessionFactory();


        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
                session.persist(a);
                transaction.commit();
    }
}