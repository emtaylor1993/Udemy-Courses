package productsmicroservice.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import productsmicroservice.entity.ProductModel;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import productsmicroservice.service.ProductServiceSynchronous;

@RestController
@RequestMapping("/productsSynchronous")
public class ProductControllerSynchronous {
    
    ProductServiceSynchronous productService;
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    public ProductControllerSynchronous(ProductServiceSynchronous productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<Object> createProduct(@RequestBody ProductModel product) {
        String productId;

        try {
            productId = productService.createProduct(product);
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new ErrorMessage(new Date(), e.getMessage(), "/productsSynchronous"));
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(productId);
    }    
}
