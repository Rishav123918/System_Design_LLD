package Design_Digital_pen;

public class Lowercase implements Writingstrategy{
    @Override
    public String formattext(String text) {
        return text.toLowerCase();
    }
}
