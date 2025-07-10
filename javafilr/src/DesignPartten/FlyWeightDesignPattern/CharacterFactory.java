package DesignPartten.FlyWeightDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    static Map<Character, LCharacter>map=new HashMap<>();
    static public LCharacter createCharacter(Character ch){
        if(map.containsKey(ch)){
            return map.get(ch);
        }
        LCharacter lt=new LCharacter(ch,"Bold",20);
        map.put(ch,lt);
        return lt;
    }
}
