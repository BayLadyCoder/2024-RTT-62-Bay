package org.example.database.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "orderdetails")
public class OrderDetail {
    @Id // this is telling hibernate this column is the PK
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // this telling hibernate that the PK is auto increment
    @Column(name = "id")
    private Integer id;

    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "quantity_ordered")
    private Integer quantityOrdered;

    @Column(name = "price_each", columnDefinition = "decimal(10,2)")
    private Float priceEach;

    @Column(name = "order_line_number", columnDefinition = "smallint")
    private Integer orderLineNumber;
}
