package Hibernate;

import Hibernate.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTests {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();
            Department department=new Department("IT", 500, 1000);
            System.out.println(department);
            Employee emp1 = new Employee("Sergio", "Dergynov", 500);
            emp1.setDepartment(department);
            session.beginTransaction();
            session.save(emp1);
            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}