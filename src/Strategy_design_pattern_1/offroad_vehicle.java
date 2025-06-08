package Strategy_design_pattern_1;

import Strategy_design_pattern_1.Strategy_.Drive_strategy;
import Strategy_design_pattern_1.Strategy_.Normal_drive;

public class offroad_vehicle extends Vehicle{
    public offroad_vehicle(){
        super(new Normal_drive());
    }
}
