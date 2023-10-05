package com.zj.springbootproductseller.service;

import com.zj.springbootproductseller.model.Product;

import java.util.List;

public interface ProductService {
    Product saveProduct(Product product);

    void deleteProductById(Long id);

    List<Product> findAllProducts();
}
