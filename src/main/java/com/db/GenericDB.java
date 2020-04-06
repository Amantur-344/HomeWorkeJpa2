package com.db;

import com.entity.Car;
import com.util.HibernateUtil;
import org.hibernate.Session;

public class GenericDB <T> {
    public T create (T t){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(t);
        session.getTransaction().commit();
        session.close();
        return t;
    }

    public static Car update(Car car){//Обновить значения
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Car c = session.load(Car.class, car.getId());
        c.setId(car.getId());
        c.setName(car.getName());
        session.getTransaction().commit();
        session.close();
        return car;

    }

    public  T delete (T t){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(t);
        session.close();
        return t;
    }
}
