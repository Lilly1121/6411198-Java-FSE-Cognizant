import java.util.Arrays;
import java.util.Scanner;

class Book implements Comparable<Book> {
    int bookId;
    String title;
    String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareToIgnoreCase(other.title);
    }

    @Override
    public String toString() {
        return "BookID: " + bookId + ", Title: " + title + ", Author: " + author;
    }
}

public class LibraryManagementSystem {

    public static Book linearSearch(Book[] books, String targetTitle) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(targetTitle)) {
                return book;
            }
        }
        return null;
    }

    public static Book binarySearch(Book[] books, String targetTitle) {
        int left = 0, right = books.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = books[mid].title.compareToIgnoreCase(targetTitle);
            if (cmp == 0) return books[mid];
            else if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of books
        System.out.print("Enter number of books: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Book[] books = new Book[n];

        // Input book details
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Book " + (i + 1) + ":");
            System.out.print("Book ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Author: ");
            String author = scanner.nextLine();
            books[i] = new Book(id, title, author);
        }

        // Search using Linear Search
        System.out.print("\nEnter title to search (Linear Search): ");
        String searchTitle1 = scanner.nextLine();
        Book result1 = linearSearch(books, searchTitle1);
        if (result1 != null)
            System.out.println("Book found (Linear Search): " + result1);
        else
            System.out.println("Book not found (Linear Search).");

        // Binary Search (sorted list)
        Arrays.sort(books); // sort by title
        System.out.print("\nEnter title to search (Binary Search): ");
        String searchTitle2 = scanner.nextLine();
        Book result2 = binarySearch(books, searchTitle2);
        if (result2 != null)
            System.out.println("Book found (Binary Search): " + result2);
        else
            System.out.println("Book not found (Binary Search).");

        scanner.close();
    }
}
