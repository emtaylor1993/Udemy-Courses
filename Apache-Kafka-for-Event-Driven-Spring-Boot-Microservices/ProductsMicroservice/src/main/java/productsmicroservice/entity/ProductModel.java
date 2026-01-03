package productsmicroservice.entity;

import java.math.BigDecimal;

/**
 * PRODUCT MODEL ENTITY
 * @author Emmanuel Taylor
 * 
 * Responsibilities:
 *  - Represents product data used by the API layer.
 *  - Carries core fields needed to create a product.
 * 
 * Notes:
 *  - BigDecimal is used for price to avoid floating point precision issues.
 */
public class ProductModel {

    private String title;
    private BigDecimal price;
    private Integer quantity;

    /** @return The product title. */
    public String getTitle() {
        return this.title;
    }

    /** @param title - The product title. */
    public void setTitle(String title) {
        this.title = title;
    }

    /** @return The product price. */
    public BigDecimal getPrice() {
        return this.price;
    }

    /** @param price - The product price. */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /** @return The product quantity. */
    public Integer getQuantity() {
        return this.quantity;
    }

    /** @param quantity - The product quantity. */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }    
}
