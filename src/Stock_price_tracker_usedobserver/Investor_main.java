package Stock_price_tracker_usedobserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Investor_main {
    public static void main(String args[]){
        stock_define stock=new stock_define();
        Observer_stock investor1=new ConcreteInvestor("Alice");
        Observer_stock investor2=new ConcreteInvestor("Bob");

        stock.add_investor(investor1);
        stock.add_investor(investor2);

        System.out.println("How many stock you want to added : ");
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        List<String> stockNames = new ArrayList<>();
        List<Double> stockPrices = new ArrayList<>();
        for(int i=0;i<x1;i++)
        {
            System.out.println("Enter stock name : ");
            String st=sc.next();
            System.out.println("Enter updated price : ");
            Double price=sc.nextDouble();
            stockNames.add(st);
            stockPrices.add(price);
        }

        System.out.println("\n----- Processing Updates -----");
        for (int i = 0; i < x1; i++) {
            stock.add_stock(stockNames.get(i), stockPrices.get(i));
        }
        stock.remove_investor(investor1);

        stock.add_stock("RELIANCE", 2820.75);




    }
}
