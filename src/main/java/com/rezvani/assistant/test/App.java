package com.rezvani.assistant.test;

import com.rezvani.assistant.model.User;
import org.hibernate.Session;

/**
 * Created by mrezvani on 6/25/2016.
 */
public class App {
    public static void main( String[] args )
    {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        User user = new User();

        user.setFirstName("ali");
        user.setLastName("alavi");

        session.save(user);
        session.getTransaction().commit();
    }

}
