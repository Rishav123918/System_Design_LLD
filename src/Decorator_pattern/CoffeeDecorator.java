package Decorator_pattern;

public abstract class CoffeeDecorator implements Coffee{
    protected Coffee decoratedCoffee;
    CoffeeDecorator(Coffee decoratedCoffee){
        this.decoratedCoffee=decoratedCoffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost();
    }
}
