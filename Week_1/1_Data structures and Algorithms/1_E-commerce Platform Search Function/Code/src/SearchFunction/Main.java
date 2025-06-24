package SearchFunction;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book(101, "The Alchemist"),
                new Book(102, "Harry Potter"),
                new Book(103, "To Kill a Mockingbird")
        };

        Book foundLinear = BookSearch.linearSearch(books, "Harry Potter");
        System.out.println("Linear Search: " + (foundLinear != null ? foundLinear.title : "Not Found"));

        Book foundBinary = BookSearch.binarySearch(books, "The Alchemist");
        System.out.println("Binary Search: " + (foundBinary != null ? foundBinary.title : "Not Found"));
    }
}
