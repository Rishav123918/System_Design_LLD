package Design_Digital_pen;

public class Digital_pen_main {
    public static void main(String args[]){
        Pen mypen=new Pen();
        mypen.setColor(Color.red);
        mypen.setThickness(Thickness.bold);
        mypen.setWritingStrategy(new Upperclass());

        String text1="Hello wordl";
        mypen.write(text1);

        mypen.setWritingStrategy(new NormalStrategy());
        mypen.write("Digital pen");

    }
}
// it follows a strategy pattern
/*
 What is Strategy Pattern?
The Strategy Pattern is a behavioral design pattern that lets you select an algorithm (behavior) at runtime.
Instead of hardcoding the logic, you pass in a "strategy" object that performs the behavior.

📦 Strategy Pattern Structure:
Role	What it does	Your Example
Context	Uses a strategy	Pen class
Strategy (interface)	Declares a method for behavior	WritingStrategy interface
ConcreteStrategy	Implements a specific behavior	UpperCaseStrategy, NormalStrategy, etc.

🖊 How the Digital Pen uses it:
✅ 1. The Strategy Interface:
java
Copy
Edit
public interface WritingStrategy {
    String formatText(String text);
}
This is the strategy contract — any formatting behavior must follow this method signature.

✅ 2. Concrete Strategies (Different Behaviors):
public class UpperCaseStrategy implements WritingStrategy {
    public String formatText(String text) {
        return text.toUpperCase();
    }
}

public class ReverseStrategy implements WritingStrategy {
    public String formatText(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
Each strategy defines its own algorithm for formatting text.

✅ 3. Context: The Pen Class
public class Pen {
    private WritingStrategy strategy;

    public void setWritingStrategy(WritingStrategy strategy) {
        this.strategy = strategy;
    }

    public void write(String text) {
        String formatted = strategy.formatText(text);
        System.out.println("Writing: " + formatted);
    }
}
The Pen uses the strategy to format text, but it doesn’t care how the formatting is done.

That logic is delegated to the strategy object.

✅ 4. Runtime Behavior Selection:
Pen pen = new Pen();

pen.setWritingStrategy(new UpperCaseStrategy());
pen.write("hello"); // Outputs: HELLO

pen.setWritingStrategy(new ReverseStrategy());
pen.write("world"); // Outputs: dlrow
Here, the behavior of the Pen is changing at runtime by injecting different strategy objects.

🔁 Analogy: Pen as a Tool
Think of your pen as a smart tool. It can write:

Normally

In UPPERCASE

In lowercase

In reverse

But instead of reprogramming the pen each time, you just plug in a different behavior module (strategy).

🎯 Why This is Strategy Pattern?
Behavior (formatText) is encapsulated in separate classes.

You can change behavior at runtime.

The Pen class is open for extension (add new strategies), but closed for modification (you never change its internal code).

It follows SOLID principles, especially:

Open/Closed

Single Responsibility

Dependency Inversion
*/