package productsmicroservice.service;

import productsmicroservice.entity.ProductModel;

/**
 * SYNCHRONOUS PRODUCT SERVICE INTERFACE
 * @author Emmanuel Taylor
 * 
 * Responsibilities:
 *  - Defines the contract for creating products synchronously.
 *  - The implementation is expected to complete processing before returning to the caller.
 */
public interface ProductServiceSynchronous {

    /**
     * Creates a Product using the synchronous flow and returns the generated productId.
     * 
     * @param product - ProductModel object containing product details.
     * @return The generated productId as a String.
     * @throws Exception If there is an error during product creation.
     */
    String createProduct(ProductModel product) throws Exception;
}
