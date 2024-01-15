import java.util.*;

public class LCM {
    public static void main(String[] args) {
        String  expression = "e + 8 - a *5";
        String[] evalvars = {"e"};
        int[] evalints = {1};
        List<String> out=basicCalculatorIV(expression,evalvars,evalints);
        System.out.println(out);
    }
    public static List<String> basicCalculatorIV(String expression, String[] evalvars, int[] evalints) {
        Map<String,Integer> map=new HashMap<>();
        for(int i=0; i<evalvars.length; i++){
            map.put(evalvars[i],evalints[i]);
        }
        Stack<String> stack= new Stack<>();
        Stack<Character> oprator= new Stack<>();
        StringBuilder exp= new StringBuilder();
        char op='+';

        for(int i=0; i<expression.length(); i++){
            char ch=expression.charAt(i);
            if(ch==' '){
                continue;
            }
            else if(ch=='('){
                stack.push("(");
                oprator.push(op);
                exp=new StringBuilder();
                op='+';

            }
            else if(ch==')'){
                StringBuilder temp=new StringBuilder();
                int total=0;
                while (stack.peek()=="("){
                    if(isDigit(stack.peek())){
                        total=total+Integer.parseInt(stack.pop());
                    }
                    else{
                        temp.append(stack.pop());
                    }
                }
                stack.pop();
                temp.append(total);

            }
            else if(ch=='+'||ch=='-'||ch=='*'){
                if(op=='+'){
                    if(map.containsKey(exp.toString())){
                        int val=map.get(exp.toString());
                        stack.push(Integer.toString(val));
                    }
                    else{
                        stack.push(exp.toString());
                    }
                }
                else if(op=='-'){
                    String currExp=exp.toString();
                    if(isDigit(currExp)){
                        int val=-1*Integer.parseInt(currExp);
                        stack.push(Integer.toString(val));
                    }
                    else if(map.containsKey(currExp)){
                        int val=-1*map.get(currExp);
                        stack.push(Integer.toString(val));
                    }
                    else{
                        StringBuilder temp= new StringBuilder();
                        temp.append('-');
                        temp.append('1');
                        temp.append('*');
                        temp.append(currExp);
                        stack.push(temp.toString());
                    }
                }
                else{
                    String prevExp=stack.pop().toString();
                    String currExp=exp.toString();
                    if(map.containsKey(currExp)){
                        int val=map.get(currExp);
                        currExp= Integer.toString(val);
                    }
                    String result= multiply(prevExp, currExp);
                    stack.push(result);
                }
                op=ch;
                exp= new StringBuilder();
            }
            else {
                exp.append(ch);
            }

        }
        if(op=='+'){
            if(map.containsKey(exp.toString())){
                int val=map.get(exp.toString());
                stack.push(Integer.toString(val));
            }
            else{
                stack.push(exp.toString());
            }
        }
        else if(op=='-'){
            String currExp=exp.toString();
            if(isDigit(currExp)){
                int val=-1*Integer.parseInt(currExp);
                stack.push(Integer.toString(val));
            }
            else if(map.containsKey(currExp)){
                int val=-1*map.get(currExp);
                stack.push(Integer.toString(val));
            }
            else{
                StringBuilder temp= new StringBuilder();
                temp.append('-');
                temp.append('1');
                temp.append('*');
                temp.append(currExp);
                stack.push(temp.toString());
            }
        }
        else{
            String prevExp=stack.pop().toString();
            String currExp=exp.toString();
            if(map.containsKey(currExp)){
                int val=map.get(currExp);
                currExp= Integer.toString(val);
            }
            String result= multiply(prevExp, currExp);
            stack.push(result);
        }

        List<String> out=new ArrayList<>();
        int sum=0;
        while (!stack.isEmpty()){
            if(isDigit(stack.peek())){
                sum=sum+Integer.parseInt(stack.pop());
            }
            else{
                out.add(stack.pop());
            }
        }
        out.add(Integer.toString(sum));

        return out;

    }
    private static String multiply(String prevExp, String currExp){
        int num1=0;
        if(isDigit(prevExp)){
            num1=Integer.parseInt(prevExp);
        }
        int num2=0;
        if(isDigit(currExp)){
            num2=Integer.parseInt(currExp);
        }
        if(num1!=0 && num2==0){
            if(currExp.charAt(0)=='-'){
                StringBuilder temp= new StringBuilder();
                temp.append('-');
                temp.append(num1);
                temp.append('*');
                temp.append(currExp.substring(3));
                return temp.toString();
            }
            else{
                StringBuilder temp= new StringBuilder();
                temp.append(num1);
                temp.append('*');
                temp.append(currExp);
                return temp.toString();
            }
        }
        else if(num1==0 && num2!=0){
            if(prevExp.charAt(0)=='-'){
                StringBuilder temp= new StringBuilder();
                temp.append('-');
                temp.append(num2);
                temp.append('*');
                temp.append(prevExp.substring(3));
                return temp.toString();
            }
            else{
                StringBuilder temp= new StringBuilder();
                temp.append(num2);
                temp.append('*');
                temp.append(prevExp);
                return temp.toString();
            }
        }
        else if(num1==0 && num2==0){
            if(prevExp.charAt(0)=='-'&&currExp.charAt(0)=='-'){
                StringBuilder temp= new StringBuilder();
                temp.append(prevExp.substring(3));
                temp.append('*');
                temp.append(currExp.substring(3));
                return temp.toString();
            }
            else if(prevExp.charAt(0)!='-'&&currExp.charAt(0)=='-'){
                StringBuilder temp= new StringBuilder();
                temp.append('-');
                temp.append('1');
                temp.append('*');
                temp.append(prevExp);
                temp.append('*');
                temp.append(currExp.substring(3));
                return temp.toString();
            }
            else if(prevExp.charAt(0)=='-'&&currExp.charAt(0)!='-'){
                StringBuilder temp= new StringBuilder();
                temp.append('-');
                temp.append('1');
                temp.append('*');
                temp.append(prevExp.substring(3));
                temp.append('*');
                temp.append(currExp);
                return temp.toString();
            }
            else{
                StringBuilder temp= new StringBuilder();
                temp.append(prevExp);
                temp.append('*');
                temp.append(currExp);
                return temp.toString();
            }
        }
        int val=num1*num2;
        return Integer.toString(val);
    }
    private static boolean isDigit(String prevExp) {
        for (char ch : prevExp.toCharArray()){
            if (ch == '-') {
                continue;
            }
            if (!Character.isDigit(ch)) {
                return false;
            }
        }

        return true;
    }

}





