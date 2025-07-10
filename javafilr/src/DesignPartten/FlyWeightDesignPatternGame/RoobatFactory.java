package DesignPartten.FlyWeightDesignPatternGame;

import java.util.HashMap;
import java.util.Map;

public class RoobatFactory {
   static Map<String,Roobat> map=new HashMap<>();
    static public Roobat createRoobot(String name){
        if(map.containsKey(name)){
            return map.get(name);
        }
       if(name.equalsIgnoreCase("Humanoid")){
           Cartoon cat=new Cartoon(1000,1000);
           Roobat rt=new Humanoid(name,cat);
           map.put(name,rt);
           return rt;
       }
       else if(name.equalsIgnoreCase("Dog")){
           Cartoon cat=new Cartoon(200,200);
           Roobat rt=new Humanoid(name,cat);
           map.put(name,rt);
           return rt;
       }
       return null;
    }
}
