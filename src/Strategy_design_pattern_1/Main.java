package Strategy_design_pattern_1;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new offroad_vehicle();
        vehicle1.drive1();
    }
}
/*
🔷 What is Strategy Pattern?
Strategy Pattern lets you define a family of algorithms (or behaviors), put each in a separate class, and make them
interchangeable without changing the client code.
 */

/*
What is the Strategy Design Pattern?
The Strategy Design Pattern is a behavioral design pattern that allows you to define a family of algorithms or behaviors,
put each of them in a separate class, and make them interchangeable at runtime. This pattern is useful when you want to
dynamically change the behavior of a class without modifying its code.
 */

/*🚗 Real-Life Analogy
Imagine you drive different vehicles:

OffRoadVehicle → drives normally

RaceCar → drives in sports mode

ElectricCar → drives in eco mode

Each vehicle does not have to rewrite driving logic.
Instead, it picks the strategy class for driving — making the design flexible and reusable.

🧠 Why Use Strategy Pattern?
Benefit	Explanation
✅ Clean separation	Each behavior is in its own class
✅ Easy to add new behavior	Just create a new class implementing the interface
✅ Open/Closed Principle	Add new behavior without changing old code
✅ Reusability	Share behaviors across different classes

🧾 Final Summary
Component	What it does
Drive_strategy	The strategy interface
Normal_drive, Sports_drive	Concrete driving behaviors
Vehicle	Context that uses the strategy
offroad_vehicle	A specific vehicle that uses a specific strategy
Main	The client that runs the code*/
