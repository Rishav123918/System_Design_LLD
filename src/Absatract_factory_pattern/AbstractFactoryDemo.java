package Absatract_factory_pattern;
interface Car {
    void drive();
}
interface Engine {
    void start();
}

// Step 2: Concrete Products for Electric
class ElectricCar implements Car {
    public void drive() {
        System.out.println("Driving Electric Car");
    }
}
class ElectricEngine implements Engine {
    public void start() {
        System.out.println("Starting Electric Engine");
    }
}

// Concrete Products for Petrol
class PetrolCar implements Car {
    public void drive() {
        System.out.println("Driving Petrol Car");
    }
}
class PetrolEngine implements Engine {
    public void start() {
        System.out.println("Starting Petrol Engine");
    }
}

// Step 3: Abstract Factory
interface VehicleFactory {
    Car createCar();
    Engine createEngine();
}

// Step 4: Concrete Factories
class ElectricFactory implements VehicleFactory {
    public Car createCar() {
        return new ElectricCar();
    }
    public Engine createEngine() {
        return new ElectricEngine();
    }
}

class PetrolFactory implements VehicleFactory {
    public Car createCar() {
        return new PetrolCar();
    }
    public Engine createEngine() {
        return new PetrolEngine();
    }
}
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        VehicleFactory factory = new ElectricFactory();

        Car car = factory.createCar();
        Engine engine = factory.createEngine();

        car.drive();       // Driving Electric Car
        engine.start();    // Starting Electric Engine
    }
}
