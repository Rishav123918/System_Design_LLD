package Library_system;

import java.util.HashSet;
import java.util.Set;

public class User {
    private static int userCounter = 1;

    private String userid;
    private String name;
    private Set<Book>borrowbook=new HashSet<>();
    private static final int MAX_BORROW_LIMIT = 3;

    public User(String name) {
        this.name = name;
        this.userid = String.format("U%03d", userCounter++); // e.g., U001, U002...
    }

    public String getUserId() {
        return userid;
    }

    public String getName() {
        return name;
    }

    public boolean canborrowmore(){
        return borrowbook.size() < MAX_BORROW_LIMIT;
    }
    public void addbook(Book book){
        borrowbook.add(book);
    }
    public boolean hasBorrowed(Book book) {
        return borrowbook.contains(book);
    }

    public void returnBook(Book book) {
        borrowbook.remove(book);
    }

    @Override
    public String toString() {
        return userid + ": " + name + " (Borrowed: " + borrowbook.size() + ")";
    }
}
