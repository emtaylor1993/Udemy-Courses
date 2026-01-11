package core;

import java.math.BigDecimal;

/**
 * PRODUCT CREATED EVENT (KAFKA PAYLOAD)
 * @author Emmanuel Taylor
 * 
 * Responsibilities:
 *  - Represents the event published when a Product is created.
 *  - Acts as the message payload sent to Kafka for downstream consumers.
 * 
 * Notes:
 *  - BigDecimal is used for price to ensure precision in financial calculations.
 *  - A no-args constructor is provided for serialization/deserialization purposes.
 */
public class ProductCreatedEvent {

    private String productId;
    private String title;
    private BigDecimal price;
    private Integer quantity;

    /**
     * Default constructor for serialization/deserialization.
     */
    public ProductCreatedEvent() {

    }

    /**
     * Convenience constructor for building the event within code.
     * 
     * @param productId - Unique identifier for the created Product.
     * @param title     - Product title.
     * @param price     - Product price.
     * @param quantity  - Product quantity.
     */
    public ProductCreatedEvent(String productId, String title, BigDecimal price, Integer quantity) {
        this.productId = productId;
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    /** @return The unique identifier for the created Product. */
    public String getProductId() {
        return this.productId;
    }

    /** @param productId - Unique identifier for the created Product. */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /** @return The product title. */
    public String getTitle() {
        return this.title;
    }

    /** @param title - Product title. */
    public void setTitle(String title) {
        this.title = title;
    }

    /** @return The product price. */
    public BigDecimal getPrice() {
        return this.price;
    }

    /** @param price - Product price. */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /** @return The product quantity. */
    public Integer getQuantity() {
        return this.quantity;
    }

    /** @param quantity - Product quantity. */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
