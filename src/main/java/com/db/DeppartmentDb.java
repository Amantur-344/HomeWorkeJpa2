package com.db;

import com.entity.Department;
import com.util.HibernateUtil;
import org.hibernate.Session;

public class DeppartmentDb {
    public static Department create(Department department){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(department);
        session.getTransaction().commit();
        session.close();
        return department;
    }
}
