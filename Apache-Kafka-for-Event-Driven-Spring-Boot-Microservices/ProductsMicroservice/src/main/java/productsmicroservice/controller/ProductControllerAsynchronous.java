package productsmicroservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import productsmicroservice.entity.ProductModel;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import productsmicroservice.service.ProductServiceAsynchronous;

@RestController
@RequestMapping("/productsAsynchronous")
public class ProductControllerAsynchronous {
    
    ProductServiceAsynchronous productService;
    
    public ProductControllerAsynchronous(ProductServiceAsynchronous productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<String> createProduct(@RequestBody ProductModel product) {
        String productId = productService.createProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(productId);
    }    
}
