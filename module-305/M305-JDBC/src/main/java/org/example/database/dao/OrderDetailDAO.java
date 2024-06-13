package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.OrderDetail;
import org.example.database.utils.HibernateUtils;
import org.hibernate.Session;

public class OrderDetailDAO {
    public void insert(OrderDetail orderDetail) {
        Session session = HibernateUtils.getSessionFactory().openSession();

        session.getTransaction().begin();
        session.save(orderDetail);
        session.getTransaction().commit();

        session.close();
    }

    public void update(OrderDetail orderDetail) {
        Session session = HibernateUtils.getSessionFactory().openSession();

        session.getTransaction().begin();
        session.merge(orderDetail);
        session.getTransaction().commit();

        session.close();
    }

    public OrderDetail findByOrderIdAndProductId(Integer orderId, Integer productId) {
        Session session = HibernateUtils.getSessionFactory().openSession();

        String hql = "SELECT od FROM OrderDetail od where od.product.id = :productId and od.order.id = :orderId";

        TypedQuery<OrderDetail> query = session.createQuery(hql, OrderDetail.class);
        query.setParameter("orderId", orderId);
        query.setParameter("productId", productId);

        try {
            OrderDetail result = query.getSingleResult();
            return result;
        } catch ( Exception e ) {
            return null;
        } finally {
            session.close();
        }
    }
}
