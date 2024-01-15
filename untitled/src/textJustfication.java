import java.util.ArrayList;
import java.util.List;

public class textJustfication {
    public static void main(String[] args) {
        String[] words = {"What","must","be","acknowledgment","shall","be"};
        int maxWidth = 16;
        List<String> message=new ArrayList();
        message =fullJustify(words,maxWidth);
        for(String line:message){
            System.out.println(line);
        }
    }
    public static List<String> fullJustify(String[] words, int maxWidth){
        List<String> message=new ArrayList();
        int start=0;
        int sum=0;
        int i=0;
        int end=0;
        while(i<words.length){
            sum=sum+words[i].length()+1;
            if(((sum-1)>=maxWidth) || ((sum-1)<maxWidth && i==words.length-1)){
                if(sum-1>maxWidth) {
                    end = i - 1;
                    i--;
                }
               if(sum-1==maxWidth){
                   end=i;
               }
               if(sum-1<maxWidth){
                   end=i;
               }

                String str=lineJustify(words,start,end,maxWidth);
                message.add(str);
                start=end+1;
                sum=0;
            }
            i++;
        }

        return message;
    }
    private static String lineJustify(String[] words,int start,int end,int maxWidth){
        int extraspace = 0;
        int spaces = 0;
        if(end!= words.length-1) {
            int wordsNumber = end - start + 1;
            int wordsWidth = 0;
            for (int i = start; i <= end; i++) {
                wordsWidth = wordsWidth + words[i].length();
            }
            int spaceWidth = maxWidth - wordsWidth;
             extraspace = 0;
            if (wordsNumber != 1) {
                extraspace = spaceWidth % (wordsNumber - 1);
                spaces = spaceWidth / (wordsNumber - 1);
            } else {
                spaces = spaceWidth;
            }
        }
        else{
            spaces=1;
        }
        StringBuilder str=new StringBuilder();
        int width=0;
        while (width < maxWidth) {
            if(start<=end) {
                width = width + words[start].length();
                str.append(words[start]);
                start++;
            }
            if(extraspace>0){
                str.append(' ');
                extraspace--;
                width++;
            }
            if(width<maxWidth) {
                for (int s = 0; s < spaces; s++) {
                    str.append(' ');
                }
                width = width + spaces;
            }
            if((start==end+1) && (end== words.length-1)  &&  (width<maxWidth)){
                int lastLineSpace=maxWidth-width;
                for (int i=0; i<(lastLineSpace); i++){
                    str.append(' ');
                }
                width=width+lastLineSpace;
            }

        }

        return str.toString();
    }
}
