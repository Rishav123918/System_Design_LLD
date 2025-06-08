package Strategy_design_pattern_1;

import Strategy_design_pattern_1.Strategy_.Drive_strategy;

public class Vehicle {
    Drive_strategy drive;
    Vehicle(Drive_strategy drive)
    {
        this.drive=drive;
    }
    public void drive1(){
        drive.drive();
    }

}
