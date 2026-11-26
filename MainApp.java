
public class MainApp {

    public static void main(String[] args) {

        // A. Create book1 via the PARAMETERIZED constructor
        book book1 = new book("Clean Code", "Robert C. Martin", 3200.0, 2008, 430);

        // B. Create book2 via the DEFAULT constructor + setters
        book book2 = new book();

        book2.setTitle("Effective Java");
        book2.setAuthor("Joshua Bloch");
        book2.setPrice(4500.0);
        book2.setYear(2018);
        book2.setpages(500);
        // C. Display both
        System.out.println("=== Book 1 ===");
        book1.displayInfo();

        System.out.println("=== Book 2 ===");
        book2.displayInfo();

        // D. Test VALIDATION -- these should be REJECTED
        System.out.println("\n--- Testing validation ---");

        book1.setPrice(-500.0);
        book1.setYear(1200);
        book1.setTitle("");
        book1.setAuthor(null);
        book1.setpages(430);
        

        // E. Valid changes should be accepted
        book1.setPrice(2900.0);
        

        System.out.println("\n=== Book 1 after valid price update ===");
        book1.displayInfo();

        // F. isRecent() behavior
        System.out.println("Is Book 1 recent? " + book1.isRecent());
        System.out.println("Is Book 2 recent? " + book2.isRecent());

        // G. Copy constructor
        book book3 = new book(book1);

        book3.setTitle("Clean Code (2nd Edition)");

        System.out.println("\n=== Book 3 (copy of Book 1) ===");
        book3.displayInfo();

        // H. Static counter
        System.out.println("Total books created: " + book.getBookCount());
    }
}
