public class Object2 implements Cloneable {

        int a;
        int b;
        Object2(){
            a=10;
            b=5;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

}
