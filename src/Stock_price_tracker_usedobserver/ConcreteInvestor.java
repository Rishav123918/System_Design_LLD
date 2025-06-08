package Stock_price_tracker_usedobserver;

public class ConcreteInvestor implements Observer_stock{
    String investorName;
    public ConcreteInvestor(String stock){
        this.investorName=stock;
    }

    @Override
    public void update(String stockname, double price) {
        System.out.println(investorName + " got update: " + stockname + " is now " + price);
    }
}
