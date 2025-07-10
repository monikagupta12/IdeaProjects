import java.util.ArrayList;
import java.util.List;

final public class ImmutableObject  {
    final private int i;
    final private String s;
    final private List<Integer> list ;
    public int getInteger(){
        return i;
    }
    public String getString(){
        return s;
    }
    public List<Integer> getList(){
        List<Integer> temp=new ArrayList<>();
        temp.addAll(list);
        return temp;
    }
    public ImmutableObject(int i, String s, List<Integer> temp) {
        this.i = i;
        this.s = s;
        list=new ArrayList<>();
        list.addAll(temp);
    }
    public  String StringForm(){
        return ""+i+s+list;
    }
}
