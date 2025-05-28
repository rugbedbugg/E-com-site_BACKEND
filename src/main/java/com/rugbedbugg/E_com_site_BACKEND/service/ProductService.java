package com.rugbedbugg.E_com_site_BACKEND.service;

import com.rugbedbugg.E_com_site_BACKEND.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "IPhone", 50000),
            new Product(102, "Canon Camera", 70000),
            new Product(103, "Shure Mic", 10000)
            )
        );

    public List<Product> getProducts() {
        return products;
    }
    public Product getProductByID(int prodID) {
        return products.stream()
                .filter(p -> p.getProdID() == prodID)
                .findFirst().orElse(new Product(69, "No Such Item", 0));
    }
    public void addProduct(Product prod) {
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int index=0;
        for (int i=0; i<products.size(); i++) {
            if (products.get(i).getProdID() == prod.getProdID())
                index = i;
        }
        products.set(index,prod);
    }

    public void deleteProduct(int prodID) {
        int index=0;
        for (int i=0; i<products.size(); i++) {
            if (products.get(i).getProdID() == prodID)
                index = i;
        }
        products.remove(index);
    }
}
