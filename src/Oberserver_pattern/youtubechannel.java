package Oberserver_pattern;

import java.util.*;

public class youtubechannel implements subject{
    private List<observer>subs = new ArrayList<>();
    @Override
    public void register(observer o) {
       subs.add(o);
    }

    @Override
    public void unregister(observer o) {
      subs.remove(o);
    }

    @Override
    public void notifyall(String msg) {
        for(observer sb:subs){
            sb.update1(msg);
        }
    }

    public void addvideo(String title){
        System.out.println("Tittle updated : "+title);
        notifyall(title);
    }
}
