package Oberserver_pattern;

public class subscriber implements observer{
    public String name;
    public subscriber(String name){
        this.name=name;
    }
    @Override
    public void update1(String message) {
        System.out.println(name+"recieve notification : "+message);
    }
}
