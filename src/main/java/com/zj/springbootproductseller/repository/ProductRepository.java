package com.zj.springbootproductseller.repository;

import com.zj.springbootproductseller.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
