package Library_system;

public class Main {
    public static void main(String args[]){
        Bookfunction lib = new Bookfunction();
        lib.addbook("B001", "Author A");
        lib.addbook("B002", "Author B");
        lib.addbook("B003","Author C");

        User user1 = new User("Ravi");

        lib.borrowbook("B001", user1);
        lib.borrowbook("B002", user1);
        lib.returnbook("B001", user1);
        lib.returnbook("B003", user1);
    }
}
