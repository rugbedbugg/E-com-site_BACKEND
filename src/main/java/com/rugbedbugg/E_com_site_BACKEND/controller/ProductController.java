package com.rugbedbugg.E_com_site_BACKEND.controller;

import com.rugbedbugg.E_com_site_BACKEND.model.Product;
import com.rugbedbugg.E_com_site_BACKEND.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    // @RequestMapping("/products", GET) // RequestMapping is GET request by default
    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/products/product-ID={prodID}")
    public Product getProductById(@PathVariable int prodID) {
        return service.getProductByID(prodID);
    }

    // @RequestMapping("/products", POST)
    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod) {
        service.addProduct(prod);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod) {
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/product-ID={prodID}")
    public void deleteProduct(@PathVariable int prodID) {
        service.deleteProduct(prodID);
    }
}
