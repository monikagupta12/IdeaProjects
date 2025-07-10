package DesignPartten.TemplateDesignPattern;

public abstract class Shopping {
    boolean gift;
    public Shopping(boolean gift) {
        this.gift = gift;
    }

    public abstract void getProduct();
    public abstract void makePayment();
    public void packing(){
        if(gift){
            System.out.println("Product is gift Pack");
        }
        else{
            System.out.println("Product is NormalPacking");
        }
    }
    public abstract void deliver();
    public final void process(){
        getProduct();
        makePayment();
        packing();
        deliver();
    }
}

