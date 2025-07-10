package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    double price;
    Product(int id, String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    @Override
    public String toString(){
        return ""+id+"-"+name+"-"+price;
    }
}
public class Filter4 {
    public static void main(String[] args) {
        List<Product> list= Arrays.asList(
                new Product(1,"HP Laptop",25000),
                new Product(2,"Dell Laptop",30000),
                new Product(3,"Lenova Laptop",28000),
                new Product(4,"Soney Laptop",23000),
                new Product(5,"Apple Laptop",90000)
        );
        List<Product> pr=list.stream().filter(product -> product.price>25000).collect(Collectors.toList());
        System.out.println(pr);
        list.stream().filter(product -> product.price>25000).forEach(i-> System.out.println(i.price));
    }

}
