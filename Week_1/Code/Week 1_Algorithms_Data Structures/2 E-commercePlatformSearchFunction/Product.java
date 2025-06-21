public class Product {
    private String productId;
    private String productName;
    private String category;

    public Product(String id, String name, String category) {
        this.productId = id;
        this.productName = name;
        this.category = category;
    }

    public String getProductId() { return productId; }
    public String getProductName() { return productName; }

    @Override
    public String toString() {
        return "[" + productId + "] " + productName + " (" + category + ")";
    }

    public void setQuantity(int quantity) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setQuantity'");
    }
}
