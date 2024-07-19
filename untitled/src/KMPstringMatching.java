import java.util.ArrayList;
import java.util.List;

/**
 * @author devenps
 */

public class KMPstringMatching {
    public static void main(String[] args){
        KMPstringMatching s1=new KMPstringMatching();
        s1.KMPAlgo("greekxgreek","greek");

    }
    private List KMPAlgo(String s, String p){
        List<Integer> list=new ArrayList<>();
        int n=s.length();
        int m=p.length();
        int i=0;
        int j=0;
        int[] lsp=findLSP(p);
        while(i<n){
            if(s.charAt(i)==p.charAt(j)){
                i++;
                j++;
                if(j==m){
                    list.add(i-m);
                    j=lsp[j-1];
                }
            }
            else{
                if(j==0){
                    i++;
                }
                else{
                    j=lsp[j-1];
                }
            }
        }
        return list;

    }
    private int[] findLSP(String ptr){
        char[] p=ptr.toCharArray();
        int m=p.length;
        int[] lsp=new int[m];
        int len=0;
        int i=1;
        lsp[0]=0;
        while(i<m){
            if(p[i]==p[len]){
                len++;
                lsp[i]=len;
                i++;
            }
            else if(len==0){
                lsp[len]=0;
                i++;
            }
            else{
                len=lsp[len-1];
            }
        }
        return lsp;
    }
}
