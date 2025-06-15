package Library_system;


public class Book {
    private String bookid;
    private String Authorname;
    private String TitleName;
    private boolean isAvailable =true;

    public Book(String bookid, String TitleName, String Authorname) {
        this.bookid =bookid; this.TitleName = TitleName; this.Authorname = Authorname;
    }
    public String getBookid(){
        return bookid;
    }

    public String getAuthorname() {
        return Authorname;
    }

    public String getTitleName() {
        return TitleName;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable=available;
    }

    @Override
    public String toString() {
        return TitleName + " by " + Authorname + " [" + (isAvailable ? "Available" : "Issued") + "]";
    }
}
