public class Object1 implements Cloneable {
    public int a;
    public String s;
    public Object2 v=new Object2();
    public Object1(int a, String s){
        this.a=a;
        this.s=s;
    }
    // Shallow Cloning
   /* @Override
    public Object1 clone() throws CloneNotSupportedException {
        return (Object1) super.clone();
    }*/

    @Override
    public Object1 clone() throws CloneNotSupportedException {
        Object1 o= (Object1) super.clone();
        o.v= (Object2) v.clone();
        return o;
    }
    @Override
    public String toString() {
        return ""+a+s+v.a+v.b;
    }
}

