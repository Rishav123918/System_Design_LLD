package Strategy_design_pattern_1.Strategy_;

public class Normal_drive implements Drive_strategy{

    @Override
    public void drive() {
        System.out.println("normal drive");
    }
}
