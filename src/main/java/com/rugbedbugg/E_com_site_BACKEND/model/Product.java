package com.rugbedbugg.E_com_site_BACKEND.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Product {

    public Product() {}

    @Id
    private int prodID;

    private String prodName;
    private int price;
}
