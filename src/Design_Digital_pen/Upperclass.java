package Design_Digital_pen;

public class Upperclass implements Writingstrategy{
    @Override
    public String formattext(String text) {
        String upper=text.toUpperCase();
        return upper;
    }
}
