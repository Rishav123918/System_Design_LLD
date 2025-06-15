package Library_system;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bookfunction implements Book_operations,Book_need{
//    void addbook(String bookid,String Authorname);
//    void removebook(String bookid,String Authorname);
//    List<Book> searchbytitle(String TitleName);
//    List<Book>searchbyauthor(String Authorname);
//    boolean isAvailable(String bookid);
//boolean borrowbook(String bookid,User user);
//    boolean returnbook(String bookid,User user);
    private Map<String,Book>books=new HashMap<>();

    public void addbook(String bookid,String Authorname){
        Book book=new Book(bookid,bookid,Authorname);
        books.put(bookid,book);
        System.out.println("Book added : "+book);
    }

    @Override
    public void removebook(String bookid, String Authorname) {
        if(books.containsKey(bookid) && books.get(bookid).getAuthorname().equals(Authorname)){
            books.remove(bookid);
            System.out.println("Book removed : "+bookid);
        }else{
            System.out.println("Book is not present");
        }
    }

    @Override
    public List<Book> searchbytitle(String TitleName) {
        List<Book>result=new ArrayList<>();
        for(Book b:books.values()){
            if(b.getTitleName().equalsIgnoreCase(TitleName)){
                result.add(b);
            }
        }
        return result;
    }

    @Override
    public List<Book> searchbyauthor(String Authorname) {
        List<Book>result=new ArrayList<>();
        for(Book b:books.values()){
            if(b.getAuthorname().equalsIgnoreCase(Authorname)){
                result.add(b);
            }
        }
        return result;
    }

    @Override
    public boolean isAvailable(String bookid) {
        Book b=books.get(bookid);
        return b!=null && b.isAvailable();
    }

    public boolean borrowbook(String bookId, User user) {
        Book book = books.get(bookId);
        if (book == null) {
            System.out.println("Book not found.");
            return false;
        }
        if (!book.isAvailable()) {
            System.out.println("Book is already issued.");
            return false;
        }
        if (!user.canborrowmore()) {
            System.out.println("User reached borrow limit.");
            return false;
        }

        book.setAvailable(false);
        user.addbook(book);
        System.out.println("Book borrowed: " + book.getTitleName() + " by " + user.getName());
        return true;
    }

    public boolean returnbook(String bookId, User user) {
        Book book = books.get(bookId);
        if (book == null) {
            System.out.println("Book not found.");
            return false;
        }
        if (!user.hasBorrowed(book)) {
            System.out.println("User hasn't borrowed this book.");
            return false;
        }

        book.setAvailable(true);
        user.returnBook(book);
        System.out.println("Book returned: " + book.getTitleName() + " by " + user.getName());
        return true;
    }
}
