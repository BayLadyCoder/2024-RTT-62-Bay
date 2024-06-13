package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Order;
import org.example.database.utils.HibernateUtils;
import org.hibernate.Session;

import java.util.List;

public class OrderDAO {
    public void update(Order order) {
        Session session = HibernateUtils.getSessionFactory().openSession();

        session.getTransaction().begin();
        session.merge(order);
        session.getTransaction().commit();

        session.close();
    }

    public List<Order> findByCustomerId(Integer customerId) {
        Session session = HibernateUtils.getSessionFactory().openSession();

        String hql = "SELECT o FROM Order o where o.customerId = :customerId";
        TypedQuery<Order> query = session.createQuery(hql,Order.class);
        query.setParameter("customerId", customerId);

        List<Order> orders = query.getResultList();

        session.close();

        return orders;
    }

    public Order findById(Integer id) {
        Session session = HibernateUtils.getSessionFactory().openSession();

        String hql = "SELECT o FROM Order o where o.id = :id";
        TypedQuery<Order> query = session.createQuery(hql,Order.class);
        query.setParameter("id", id);


        try {
            return query.getSingleResult();
        } catch ( Exception e ) {
            return null;
        } finally {
            session.close();
        }
    }
}
