package Design_Digital_pen;

import java.util.ArrayList;
import java.util.List;

public class Pen {
    private Color color;
    private Thickness thickness;
    private Writingstrategy strategy;
    private List<String>history;

    public Pen(){
        this.color=color;
        this.thickness=thickness;
        this.strategy=new NormalStrategy();
        this.history=new ArrayList<>();
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setThickness(Thickness thickness) {
        this.thickness = thickness;
    }

    public void setWritingStrategy(Writingstrategy strategy) {
        this.strategy = strategy;
    }

    private String getColorName() {
        return color.name();
    }

    private String getThicknessName() {
        return thickness.name();
    }
    public void write(String text){
        String formatted=strategy.formattext(text);
        history.add(formatted);
        System.out.println("Wrting : " + formatted + "with" + getColorName() +" pen in "
                + getThicknessName() + " thickness.");
    }


}
