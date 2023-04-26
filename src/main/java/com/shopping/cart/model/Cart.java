package com.shopping.cart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Cart")
public class Cart {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int cartId;
    int userId;
    int productId;
    String productName;
    int productQuantity;
    int productPrice;
    int totalProductPrice;
}
