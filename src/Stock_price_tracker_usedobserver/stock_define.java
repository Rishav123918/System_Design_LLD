package Stock_price_tracker_usedobserver;

import java.util.ArrayList;
import java.util.List;

public class stock_define implements Subject_stock{
    private String stock_name;
    private double price1;
    private List<Observer_stock>observer=new ArrayList<>();

//    public stock_define(){
//        this.stock_name=stock_name;
//        this.price1=price1;
//        this.observer=new ArrayList<>();
//    }

    @Override
    public void add_investor(Observer_stock stock) {
        observer.add(stock);
    }

    @Override
    public void remove_investor(Observer_stock stock) {
        observer.remove(stock);
    }
    public void notifyall(){
        for(Observer_stock st:observer){
            st.update(stock_name,price1);
        }
    }
    public void  add_stock(String stockname,double price){
        this.stock_name=stockname;
        this.price1=price;
        System.out.println("Stock updated : " +stockname+" : " + " price :"+ price );
        notifyall();
    }
}
