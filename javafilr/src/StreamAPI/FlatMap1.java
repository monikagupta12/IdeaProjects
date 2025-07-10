package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap1 {
    public static void main(String[] args) {
        List<List<Integer>> list= Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4),Arrays.asList(5,6));
        List<Integer>out=list.stream().flatMap(x->x.stream().map(y->y+10)).map(x->x+10).collect(Collectors.toList());
        System.out.println(out);

    }
}
