public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product("P101", "Mouse", 50, 299.99);
        Product p2 = new Product("P102", "Keyboard", 30, 749.00);

        manager.addProduct(p1);
        manager.addProduct(p2);

        manager.updateProduct("P101", 60, 279.99);
        manager.deleteProduct("P102");

        manager.displayAllProducts();
    }
}
