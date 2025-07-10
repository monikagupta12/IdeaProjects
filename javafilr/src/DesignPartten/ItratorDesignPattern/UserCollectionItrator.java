package DesignPartten.ItratorDesignPattern;

import java.util.List;

public class UserCollectionItrator implements Itrator{
    List<User> list;
    int pos=0;
    int size;
    public UserCollectionItrator(List<User> list) {
        this.list = list;
        size=list.size();
    }

    @Override
    public boolean hashNext() {
       if(pos==size){
           return false;
       }
       return true;
    }

    @Override
    public Object next() {
        return list.get(pos++);
    }
}
