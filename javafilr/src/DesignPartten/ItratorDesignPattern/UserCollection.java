package DesignPartten.ItratorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class UserCollection {
    public List<User>list;
    public UserCollection() {
        this.list = new ArrayList<>();
    }
    public Itrator getItrator(){
        return new UserCollectionItrator(list);
    }
    public void addUser(User u){
        list.add(u);
    }
    public void remove(int i){
        if(i>=list.size()){
            throw new NullPointerException("Access invail location");
        }
        list.remove(i);
    }
}
