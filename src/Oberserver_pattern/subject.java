package Oberserver_pattern;

public interface subject {
    void register(observer o);
    void unregister(observer o);
    void notifyall(String msg);
}
