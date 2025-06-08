package Factory_Pattern;
interface Car {
    void drive();
}

// Step 2: Concrete Products
class Sedan implements Car {
    public void drive() {
        System.out.println("Driving a Sedan");
    }
}

class SUV implements Car {
    public void drive() {
        System.out.println("Driving an SUV");
    }
}

// Step 3: Factory
class CarFactory {
    public static Car getCar(String type) {
        if (type.equalsIgnoreCase("Sedan")) return new Sedan();
        else if (type.equalsIgnoreCase("SUV")) return new SUV();
        return null;
    }
}
public class FactoryPatternDemo {
    public static void main(String[] args) {
        Car car1 = CarFactory.getCar("Sedan");
        car1.drive(); // Driving a Sedan

        Car car2 = CarFactory.getCar("SUV");
        car2.drive(); // Driving an SUV
    }
}
