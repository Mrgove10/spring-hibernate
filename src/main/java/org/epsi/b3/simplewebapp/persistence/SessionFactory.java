package org.epsi.b3.simplewebapp.persistence;

import org.hibernate.SessionFectory;
import org.hibernate.cfg.Configuration;

public class SessionFactory {
    public static SessionFactory SF = new Configuration().configure().builderSessionFactory();

    public static void main(){

    }

}
