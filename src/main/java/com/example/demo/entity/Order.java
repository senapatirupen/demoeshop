package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Data
@Entity
@Table(name="Order")
public class Order implements Serializable {

    @Id
    @GeneratedValue
    private Long orderId;
    private Long productId, customerId;
    private int quantity, price;

}
