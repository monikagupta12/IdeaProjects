package DesignPartten.ObserverDesigenPattern;

import java.util.ArrayList;
import java.util.Map;

public class YouTubeChannel implements Subject {
    ArrayList<Observer>list;
    YouTubeChannel(){
        list=new ArrayList<>();
    }
    @Override
    public void suscribe(Observer ob) {
        list.add(ob);
    }

    @Override
    public void unSuscribe(String id) {
        int index=findIndex(id);
        if(index==-1){
            System.out.println("no uder exit with this id");
            return;
        }
        list.remove(index);
    }

    @Override
    public void notifyObserver(String mesaage) {
        for (Observer ob:list){
            ob.noftification(mesaage);
        }

    }
    public int findIndex(String match){
        for(int i=0; i<list.size(); i++){
            Observer ob=list.get(i);
            String id=ob.id;
            if(ob.id.equalsIgnoreCase(id)){
                return i;
            }
        }
        return -1;
    }
}
