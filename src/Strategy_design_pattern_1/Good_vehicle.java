package Strategy_design_pattern_1;

import Strategy_design_pattern_1.Strategy_.sports_drive;

public class Good_vehicle extends Vehicle{
    public Good_vehicle(){
        super(new sports_drive());
    }
}
