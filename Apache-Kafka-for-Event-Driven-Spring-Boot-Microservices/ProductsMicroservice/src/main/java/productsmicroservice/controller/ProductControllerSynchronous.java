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

/**
 * SYNCHRONOUS PRODUCT CONTROLLER
 * @author Emmanuel Taylor
 * 
 * Responsibilities:
 *  - Exposes an endpoint for creating products synchronously.
 *  - Delegates creation logic to ProductServiceSynchronous and returns the created productId.
 *  - Provides basic error handling/logging for unexpected failures.
 */
@RestController
@RequestMapping("/productsSynchronous")
public class ProductControllerSynchronous {
    
    /** Service responsible for creating products synchronously. */
    ProductServiceSynchronous productService;

    /** Logger used for tracing and error reporting within this controller. */
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    /**
     * Constructor-based injection of ProductServiceSynchronous. Used to ensure ease of test and
     * that dependencies are provided at creation time.
     * 
     * @param productService - Service used to perform synchronous product creation.
     */
    public ProductControllerSynchronous(ProductServiceSynchronous productService) {
        this.productService = productService;
    }

    /**
     * Creates a new Product using the synchronous workflow.
     * 
     * @param product - Request payload containing product details.
     * @return 201 CREATED with the productId on success, or 500 INTERNAL SERVER ERROR with error details on failure.
     */
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
