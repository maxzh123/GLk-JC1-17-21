package Hibernate;

import Hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTests {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Employee emp1 = new Employee("Sergio", "Dergynov", "IT", 500);
            session.beginTransaction();
            session.save(emp1);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}