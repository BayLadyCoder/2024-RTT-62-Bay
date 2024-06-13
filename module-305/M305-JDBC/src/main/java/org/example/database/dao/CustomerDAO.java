package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Customer;
import org.example.database.utils.HibernateUtils;
import org.hibernate.Session;

public class CustomerDAO {
    public Customer findById(Integer id) {
        Session session = HibernateUtils.getSessionFactory().openSession();

        String hql = "SELECT c FROM Customer c where c.id = :id";
        TypedQuery<Customer> query = session.createQuery(hql,Customer.class);
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
