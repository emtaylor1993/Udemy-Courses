package productsmicroservice.service;

import productsmicroservice.entity.ProductModel;

/**
 * ASYNCHRONOUS PRODUCT SERVICE INTERFACE
 * @author Emmanuel Taylor
 * 
 * Responsibilities:
 *  - Defines the contract for creating products using an asynchonous workflow.
 *  - Typically implemented using an event-driven approach.
 */
public interface ProductServiceAsynchronous {

    /**
     * Creates a Product using the asynchronous workflow and returns the generated productId.
     * 
     * @param product - ProductModel containing product details.
     * @return Generated productId.
     */
    String createProduct(ProductModel product);
}
