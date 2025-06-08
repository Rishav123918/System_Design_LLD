package Stock_price_tracker_usedobserver;

public interface Subject_stock {
    void notifyall();

    void add_investor(Observer_stock stock);

    void remove_investor(Observer_stock stock);
}
