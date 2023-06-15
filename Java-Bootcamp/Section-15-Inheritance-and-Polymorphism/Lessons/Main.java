import product.Pants;
import product.Product;
import product.Shirt;
import product.Shirt.Size;

public class Main {
    public static void main(String[] args) {
        Shirt shirt = new Shirt(10.88, "Red", "Nike", Size.SMALL);
        shirt.fold();
        productStore(shirt);

        Pants pants = new Pants(49.99, "Black", "Levi's", 32, 32);
        pants.fold();
        productStore(pants);
    }

    // Polymorphism Example.
    public static void productStore(Product product) {
        System.out.println("Thank you for purchasing " + product.getBrand() + " " + product.getClass().getSimpleName().toLowerCase() + ". Your total comes to " + product.getPrice());
        product.wear();
    }
}