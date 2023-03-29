
public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book("Five Point Someone", "Chetan Bhagat", 2005);
        Book book2 = new Book("Five Point Someone", "Chetan Bhagat", 2005);
        Book book3 = new Book("Atomic Habits", "James Clear", 2018);

        // Test the equals method
        System.out.println("book1.equals(book2): " + book1.equals(book2));
        System.out.println("book1.equals(book3): " + book1.equals(book3));

        // Test the hashCode method
        System.out.println("book1.hashCode(): " + book1.hashCode());
        System.out.println("book2.hashCode(): " + book2.hashCode());
        System.out.println("book3.hashCode(): " + book3.hashCode());
    }
}
