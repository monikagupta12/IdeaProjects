import java.util.HashMap;
import java.util.Map;

public class MostFrequentEvenElement {
    public static void main(String[] args) {
        int[] nums={0,1,2,2,4,4,1};
        int element=mostFrequentEven(nums);
        System.out.println(element);
    }
    public static int mostFrequentEven(int[] nums){
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            if(num%2==0){
                if(map.containsKey(num)){
                    map.put(num,map.get(num)+1);
                }
                else{
                    map.put(num,1);
                }
            }
        }
        if(map.isEmpty()){
            return -1;
        }
        int maxcount=-1;
        int smallnum=-1;
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if(pair.getValue()==maxcount && pair.getKey()>smallnum){
                maxcount=pair.getValue();
            }
            else{
                maxcount=pair.getValue();
                smallnum=pair.getKey();
            }
        }
        return smallnum;

    }
}
