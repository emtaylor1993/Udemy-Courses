package productsmicroservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import productsmicroservice.entity.ProductModel;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import productsmicroservice.service.ProductServiceAsynchronous;

/**
 * ASYNCHRONOUS PRODUCT CONTROLLER
 * @author Emmanuel Taylor
 * 
 * Responsibilities:
 *  - Exposes an endpoint for creating products via an asynchronous workflow.
 *  - Delegates creation logic to ProductServiceAsynchronous.
 * 
 * Notes:
 *  - This controller returns a productId immediately and does not wait for downstream processing.
 */
@RestController
@RequestMapping("/productsAsynchronous")
public class ProductControllerAsynchronous {
    
    /** Service responsible for creating products asynchronously. */
    ProductServiceAsynchronous productService;
    
    /**
     * Constructor-based injection of ProductServiceAsynchronous. Used to ensure ease of test and
     * that dependencies are provided at creation time.
     * 
     * @param productService - Service used to perform asynchronous product creation.
     */
    public ProductControllerAsynchronous(ProductServiceAsynchronous productService) {
        this.productService = productService;
    }

    /**
     * Creates a new Product using the asynchronous workflow.
     * 
     * @param product - Request payload containing product details.
     * @return 201 CREATED response with the generated productId.
     */
    @PostMapping
    public ResponseEntity<String> createProduct(@RequestBody ProductModel product) {
        String productId = productService.createProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).body(productId);
    }    
}
