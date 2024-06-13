package org.example.database.dao;

import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import org.example.database.entity.Product;
import org.example.database.utils.HibernateUtils;
import org.hibernate.Session;
import java.util.List;

public class ProductDAO {

    // I Want to be able to search for a product and then change the quantity in stock to reflect current inventory levels.
    // 1) I need to be able to prompt the user for which product to search for
    // 2) I need to be able to show the products and allow the user to select a product to modify
    // 3) I need to prompt the user to enter the new value quantity in stock
    // 4) I need to set the new quantity in stock on the product and save it to the database

    public Product findById(Integer id) {
        Session session = HibernateUtils.getSessionFactory().openSession();

        String hql = "SELECT p FROM Product p WHERE p.id = :id";

        TypedQuery<Product> query = session.createQuery(hql, Product.class);
        query.setParameter("id", id);

        try{
            Product product = query.getSingleResult();
            return product;
        } catch (NoResultException e) {
            return null;
        } finally {
            session.close();
        }

    }

    public List<Product> findByProductName(String productName) {
        Session session = HibernateUtils.getSessionFactory().openSession();

        String hql = "SELECT p FROM Product p WHERE p.productName = :productName";

        TypedQuery<Product> query = session.createQuery(hql, Product.class);
        query.setParameter("productName", productName);

        List<Product> products = query.getResultList();

        session.close();

        return products;
    }

    public List<Product> findProductNameLike(String productName) {
        Session session = HibernateUtils.getSessionFactory().openSession();

        String hql = "SELECT p FROM Product p WHERE p.productName LIKE CONCAT('%',:productName, '%')";

        TypedQuery<Product> query = session.createQuery(hql, Product.class);
        query.setParameter("productName", productName);

        List<Product> products = query.getResultList();

        session.close();

        return products;

    }

    public void update(Product product) {
        Session session = HibernateUtils.getSessionFactory().openSession();

        session.getTransaction().begin();
        session.merge(product);
        session.getTransaction().commit();

        session.close();
    }
}
