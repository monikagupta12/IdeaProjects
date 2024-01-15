import java.util.*;

public class SimilarRabinKarp {
     public static void main(String[] args) {
         ArrayList<Integer> p1 = new ArrayList<>(Arrays.asList(0,0));
         ArrayList<Integer> p2 = new ArrayList<>(Arrays.asList(0,2));

         List<List<Integer>> points=new ArrayList<>();
         points.add(p1);
         points.add(p2);


         ArrayList<Integer> location = new ArrayList<>(Arrays.asList(1,1));
        int angle=90;
        int output=visiblePoints(points,angle,location);
        System.out.println(output);
    }
    public static int visiblePoints(List<List<Integer>> points, int angle, List<Integer> location) {
        List<Double> anglesPoint = new ArrayList<>();
        int onLocation=0;
        for (List<Integer> point : points) {
            int dy = point.get(1) - location.get(1);
            int dx = point.get(0) - location.get(0);
            if(dy==0 && dx==0){
                onLocation++;
                continue;
            }
            anglesPoint.add(Math.atan2(dy, dx) * (180 / Math.PI));

        }
        Collections.sort(anglesPoint);
        int start = 0;
        int max = 0;
        int n = anglesPoint.size();
        for (int i = 0; i < n; i++) {
            if(anglesPoint.get(i)<0) {
                anglesPoint.add(anglesPoint.get(i) + 360);
            }
        }


        for (int end = 0; end < anglesPoint.size(); end++) {
            while ((anglesPoint.get(end) -anglesPoint.get(start))>(double)angle ){
                start++;
            }
            max = Math.max(max, end - start+1);
        }

        return max+onLocation;
    }





}
