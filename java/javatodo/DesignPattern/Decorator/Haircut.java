package DesignPattern.Decorator;

public class Haircut extends Decorator {

    public Haircut(Modeling model) {
        super(model);
        System.out.println("haircut cost 500 USD");
        setPrice(500f);
        // TODO Auto-generated constructor stub
    }
    
}