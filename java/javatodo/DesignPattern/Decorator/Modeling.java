package DesignPattern.Decorator;

public abstract class Modeling {
    
   
    public abstract void show();

    public abstract float cost();

    private  float price=0.0f;
    public  float getPrice(){
        return this.price;
    }
    public void setPrice(float price){
          this.price = price;
    }
}