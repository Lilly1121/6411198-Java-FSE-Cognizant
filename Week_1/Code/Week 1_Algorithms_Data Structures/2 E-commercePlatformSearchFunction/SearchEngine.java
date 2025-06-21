import java.util.Arrays;
import java.util.Comparator;

public class SearchEngine {
    // Linear search by product name
    public static Product linearSearch(Product[] products, String name) {
        for (Product p : products) {
            if (p.getProductName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    // Binary search by product name
    public static Product binarySearch(Product[] products, String name) {
        Arrays.sort(products, Comparator.comparing(Product::getProductName));
        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = name.compareToIgnoreCase(products[mid].getProductName());

            if (cmp == 0) return products[mid];
            else if (cmp < 0) high = mid - 1;
            else low = mid + 1;
        }
        return null;
    }
}
