import java.util.ArrayList;
import java.util.List;

public class MatrixSpiral {
    public static void main(String[] args) {
        int rows=1;
        int cols=4;
        int rStart=0;
        int cStart=0;
        int[][] index=new int[rows*cols][2];
        index = spiralMatrixIII(rows,cols,rStart,cStart);
        for(int[] row:index){
            for(int col:row){
                System.out.print(col +" ");
            }
            System.out.print("||");
        }
    }
    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] index=new int[rows*cols][2];
        int idx=0;
        int rUp=rStart;
        int rDown=rStart;
        int cLeft=cStart;
        int cRight=cStart;
        while(rUp>=0 || cLeft>=0 || rDown<rows ||  cRight<cols ){
            cRight++;
            for(int c=cLeft; c<=cRight; c++){
                if(idx>0 && index[idx-1][0]==rUp  &&  index[idx-1][1]==c){
                    continue;
                }
                if(c>=0 && c<cols && rUp>=0) {
                        index[idx][0] = rUp;
                        index[idx][1] = c;
                        idx++;
                }
            }

            rDown++;

            for(int r=rUp; r<=rDown; r++) {
                if(idx>0 && index[idx-1][0]==r  &&  index[idx-1][1]==cRight){
                    continue;
                }
                if(r>=0 && r<rows && cRight<cols ) {

                        index[idx][0] = r;
                        index[idx][1] = cRight;
                        idx++;
                }
            }

            cLeft--;
            for(int c=cRight; c>=cLeft; c--) {
                if(idx>0 && index[idx-1][0]==rDown  &&  index[idx-1][1]==c){
                    continue;
                }
                if(c>=0 && c<cols && rDown<rows) {
                        index[idx][0] = rDown;
                        index[idx][1] = c;
                        idx++;
                }
            }
            rUp--;
            for(int r=rDown; r>=rUp; r--) {
                if(idx>0 && index[idx-1][0]==r  &&  index[idx-1][1]==cLeft){
                    continue;
                }
                if(r>=0 && r<rows && cLeft>=0) {
                        index[idx][0] = r;
                        index[idx][1] = cLeft;
                        idx++;
                 }
            }

        }
        return index;
    }
}
