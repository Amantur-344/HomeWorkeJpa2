package com.db;

import com.entity.Employee;
import com.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class EmployeeDb {
    public static Employee create(Employee employee) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(employee);
        session.getTransaction().commit();
        session.close();
        return employee;
    }

    public static List<Employee> getAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        List employees = session.createQuery("From com.entity.Employee").list();
        session.close();
        return employees;
    }

    public static Employee update(Employee employee){//Обновить значения
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Employee e = session.load(Employee.class, employee.getId());
        e.setId(employee.getId());
        e.setAge(employee.getAge());
        e.setName(employee.getName());
        session.getTransaction().commit();
        session.close();
        return e;

    }
}
