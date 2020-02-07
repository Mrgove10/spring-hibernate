package org.epsi.b3.simplewebapp.persistence;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MySessionFactory {
    public static SessionFactory SF = new Configuration().configure().buildSessionFactory();

    public static void main(){

    }

}
