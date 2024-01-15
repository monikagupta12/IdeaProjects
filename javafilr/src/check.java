import java.util.Scanner;

public class check {
  /*  public static String reverseWords(String s) {
        int l=s.length();
        int lidx=-1;
        int sidx=-1;
        if(l==0||lidx==l){
            return"";
        }
        for(int i=0; i<l; i++){
            if(s.charAt(i)!=' '){
                sidx=i;
                break;
            }
        }
        for(int i=sidx; i<l; i++){
            if(s.charAt(i)==' '){
                lidx=i;
                break;
            }
            else{
                lidx=l;
            }
        }

        if(sidx<0){
            return "";
        }
        System.out.println(sidx);
        System.out.println(lidx);

        String sub=s.substring(sidx, lidx);
        System.out.println(sub);
        String callstring=s.substring(lidx);
        System.out.println(callstring);



        return reverseWords(callstring) + sub;


    }
    public static void main(String[]args){
        String s="the sky is pink";
        String rs=reverseWords(s);
        System.out.println(rs);
    }

   */
/*  public static String reverseWords(String s) {
      int l=s.length();
      int lidx=-1;
      int sidx=-1;
      if(l<=0||lidx==l){
          return"";
      }
      for(int i=0; i<l; i++){
          if(s.charAt(i)!=' '){
              sidx=i;
              break;
          }
      }
      for(int i=sidx; i<l; i++){
          if(s.charAt(i)==' '){
              lidx=i;
              break;
          }
          else{
              lidx=l;
          }
      }

      if(sidx<0){
          return "";
      }
      System.out.println(sidx);
      System.out.println(lidx);

      String sub=s.substring(sidx, lidx);
     System.out.println(sub);
      String callstring=s.substring(lidx);
     // System.out.println(callstring);

      String re= reverseWords(callstring)+" " + sub;
      return re;


  }
    public static void main(String[]args){
        String s=" l   ";
        System.out.println(s);
        String rs=reverseWords(s);
        System.out.println(rs);
    }

 */
      public static String reverseWords(String s) {
                  // Trim the input string to remove leading and trailing spaces
                  String[] str = s.trim().split(" ");

                  // Initialize the output string
                  String out = "";

                  // Iterate through the words in reverse order
                  for (int i = str.length - 1; i > 0; i--) {
                      // Append the current word and a space to the output
                      if(str[i].length()!=0) {
                          out += str[i] + " ";
                      }
                  }

                  // Append the first word to the output (without trailing space)
                  return out +str[0];
      }

      public static void main(String[]args){
              Scanner sc =new Scanner(System.in);
              System.out.println("enter string");
              String s= sc.nextLine();
              String rs= reverseWords(s);
          System.out.println("revers string");
          System.out.println(rs);

      }
}

