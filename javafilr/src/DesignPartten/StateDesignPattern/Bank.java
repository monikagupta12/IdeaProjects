package DesignPartten.StateDesignPattern;

public class Bank {
    int amount;
    Card card;

    public Bank() {
        amount =0;
        card=new NoCard();
    }
    public void addAmount(int amount){
        this.amount+=amount;
        sateChange();
    }
    public void decateAmount(int amount){
        this.amount-=amount;
        sateChange();
    }
    public int getAmount(){
        return amount;
    }
    private void sateChange(){
        if(amount<2000){
            card=new NoCard();
        }
        else if(amount<10000){
            card=new SiliverCard();
        }
        else {
            card=new GoldCard();
        }
    }
    public void dicount(){
        card.currentDiscount();
    }
}
