package DesignPartten.FacadeDesignPattern;

import DesignPartten.BridgeDesignPattern.LivingThing;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    List<Product> list;
    ProductCollection(){
        list=new ArrayList<>();
    }
    public void addProduct(){
        System.out.println("product add");
    }
}
