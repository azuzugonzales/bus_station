package com.bus_station.hibernate.util;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
/**
 * Created by Azuzu on 29.05.2016.
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory;
    static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println(«Initial SessionFactory creation failed.» + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
