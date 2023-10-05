package com.zj.springbootproductseller.controller;

import com.zj.springbootproductseller.model.Product;
import com.zj.springbootproductseller.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping // api/product
    public ResponseEntity<?> saveProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
    }

    @DeleteMapping("{productId}") // api/product/{productId}
    public ResponseEntity<?> deleteProduct(@PathVariable Long productId){
        productService.deleteProductById(productId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping // api/product
    public ResponseEntity<?> getAllProducts(){
        return new ResponseEntity<>(productService.findAllProducts(),HttpStatus.OK);
    }

}
