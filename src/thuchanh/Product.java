package thuchanh;

public class Product {
    int productId;
    String productName;
    float productPrice;
    Category category;

    public Product() {
    }

    ;

    public Product(int productId, String productName, float productPrice, Category category) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
    }

    public void display() {
        System.out.println("Product ID: " + productId + " | Product Name: " + productName + " | Product Price " + productPrice + "₫" + " | Category: " + category.categoryName);
    }
}
