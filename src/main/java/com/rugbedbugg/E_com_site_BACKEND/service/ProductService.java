package com.rugbedbugg.E_com_site_BACKEND.service;

import com.rugbedbugg.E_com_site_BACKEND.model.Product;
import com.rugbedbugg.E_com_site_BACKEND.repository.ProductRepo;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101, "IPhone", 50000),
//            new Product(102, "Canon Camera", 70000),
//            new Product(103, "Shure Mic", 10000)
//            )
//        );

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductByID(int prodID) {
        return repo.findById(prodID).orElse(new Product());
    }

    public void addProduct(Product newProd) {
        repo.save(newProd);
    }

    public void updateProduct(Product updatedProd) {
        repo.save(updatedProd);
    }

    public void deleteProduct(int prodID) {
        repo.deleteById(prodID);
    }
}
