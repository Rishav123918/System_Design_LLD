package Library_system;

import java.util.List;

public interface Book_operations {
    void addbook(String bookid,String Authorname);
    void removebook(String bookid,String Authorname);
    List<Book> searchbytitle(String TitleName);
    List<Book>searchbyauthor(String Authorname);
    boolean isAvailable(String bookid);
}
