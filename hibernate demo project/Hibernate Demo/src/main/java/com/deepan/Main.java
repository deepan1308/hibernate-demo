package com.deepan;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Alien a = new Alien();
//       a.setAid(103);
//       a.setAname("tharun");
//       a.setAtech("Electronics");

//        Configuration config = new Configuration();
//        config.addAnnotatedClass(com.deepan.Alien.class);
//        config.configure("hibernate.cfg.xml");

        // or

        SessionFactory factory = new Configuration()
                .addAnnotatedClass(com.deepan.Alien.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();


        Session session = factory.openSession();
//        Transaction transaction = session.beginTransaction();
               Alien a1= session.find(Alien.class,102);
                System.out.println(a1);
              //transaction.commit();
    }
}