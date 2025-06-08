package Decorator_pattern;

public class CoffeeShop_Main {
    public static void main(String args[]){
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " - $" + coffee.cost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " - $" + coffee.cost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " - $" + coffee.cost());
    }
}

/*
🌟 Decorator Class — Definition
A decorator class is a design pattern component that wraps an existing class (or object) to add new behavior or responsibilities dynamically without modifying the original class itself.

🧩 Key Points
✅ Implements the same interface or abstract class as the component it decorates.
✅ Holds a reference to the object it decorates (composition).
✅ Delegates core behavior to the wrapped object and adds its own behavior before or after delegating.

📝 One-liner Definition
A decorator class extends the functionality of an object dynamically at runtime by wrapping it with additional behavior.

🔍 Example in Context
In the Coffee example:

SimpleCoffee implements Coffee.

SugarDecorator also implements Coffee and wraps another Coffee object.

SugarDecorator delegates core methods to the wrapped object while adding sugar-specific logic.


 */
