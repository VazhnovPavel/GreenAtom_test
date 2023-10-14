package Hibernate;

import Hibernate.domain.entity.Sportsman;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class SportsmanDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Sportsman.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            List<Sportsman> sportsmen = session.createQuery("from Sportsman", Sportsman.class).list();

            for (Sportsman sportsman : sportsmen) {
                System.out.println("Sportsman ID: " + sportsman.getSportsmanId());
                System.out.println("Sportsman Name: " + sportsman.getSportsmanName());
            }

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            factory.close();
        }
    }
}
