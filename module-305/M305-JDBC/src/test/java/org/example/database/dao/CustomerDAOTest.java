package org.example.database.dao;

import org.example.database.entity.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomerDAOTest {
    private CustomerDAO customerDAO = new CustomerDAO();

    @Test
    public void findByIdTest() {
        // given
        Integer userId = 103;

        // when
        Customer customer = customerDAO.findById(userId);

        // then
        Assertions.assertNotNull(customer);
        Assertions.assertEquals(userId, customer.getId());
        Assertions.assertEquals("Atelier graphique", customer.getCustomerName());
    }

    @Test
    public void findByInvalidIdTest() {
        // given
        Integer userId = 1030506;

        // when
        Customer customer = customerDAO.findById(userId);

        // then
        Assertions.assertNull(customer);
    }
}
