package library;

class Book {
    public boolean isAvailable = true;
    public String title = "Java Programming";
}

// 1. Low Cohesion + Tight Coupling (Worst)
class LibraryManager {
    public void manageEverything(Book book, String studentName) {
        if (book.isAvailable) {
            book.isAvailable = false;
            System.out.println(studentName + " reserved " + book.title);
            System.out.println(studentName + " paid fee.");
            System.out.println("Audit log generated.");
        }
    }
}

// 2. Low Cohesion + Loose Coupling
class ServiceHandler {
    public void handle(String action) {
        switch (action) {
            case "reserve":
                System.out.println("Book reserved.");
                break;
            case "fee":
                System.out.println("Fee submitted.");
                break;
            case "audit":
                System.out.println("Audit done.");
                break;
            default:
                System.out.println("Invalid action.");
        }
    }
}

// 3. High Cohesion + Tight Coupling
class BookTight {
    public boolean isAvailable = true;
    public String title = "DSA Book";
}

class StudentTight {
    public void requestBook(BookTight book) {
        if (book.isAvailable) {
            book.isAvailable = false;
            System.out.println("Tightly reserved: " + book.title);
        }
    }
}

// 4. High Cohesion + Loose Coupling (Best)
class BookLoose {
    private String title;
    private boolean available = true;

    public BookLoose(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void reserve() {
        if (available) {
            available = false;
            System.out.println("Loosely reserved: " + title);
        }
    }
}

class StudentLoose {
    public void requestBook(BookLoose book) {
        if (book.isAvailable()) {
            book.reserve();
        }
    }
}

// Main class to demonstrate all cases
public class Demo {
    public static void main(String[] args) {
        System.out.println("1. Low Cohesion + Tight Coupling:");
        LibraryManager manager = new LibraryManager();
        manager.manageEverything(new Book(), "Alice");

        System.out.println("\n2. Low Cohesion + Loose Coupling:");
        ServiceHandler handler = new ServiceHandler();
        handler.handle("reserve");
        handler.handle("fee");

        System.out.println("\n3. High Cohesion + Tight Coupling:");
        StudentTight s2 = new StudentTight();
        s2.requestBook(new BookTight());

        System.out.println("\n4. High Cohesion + Loose Coupling:");
        StudentLoose s3 = new StudentLoose();
        s3.requestBook(new BookLoose("OOPs in Java"));
    }
}
