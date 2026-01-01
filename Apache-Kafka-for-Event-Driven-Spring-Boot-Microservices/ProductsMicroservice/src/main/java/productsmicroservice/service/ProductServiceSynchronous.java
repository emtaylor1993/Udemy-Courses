package productsmicroservice.service;

import productsmicroservice.entity.ProductModel;

public interface ProductServiceSynchronous {
    String createProduct(ProductModel product) throws Exception;
}
