public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Shoes", "Fashion"),
            new Product("P003", "Phone", "Electronics"),
            new Product("P004", "Watch", "Accessories"),
            new Product("P005", "Book", "Stationery")
        };

        String target = "Phone";

        System.out.println("Linear Search:");
        Product result1 = SearchEngine.linearSearch(products, target);
        System.out.println(result1 != null ? "Found: " + result1 : "Product not found");

        System.out.println("\n Binary Search:");
        Product result2 = SearchEngine.binarySearch(products, target);
        System.out.println(result2 != null ? "Found: " + result2 : "Product not found");
    }
}
