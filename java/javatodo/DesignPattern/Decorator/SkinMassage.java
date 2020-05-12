package DesignPattern.Decorator;

public class SkinMassage extends Decorator {

    public SkinMassage(Modeling model) {
        super(model);
        System.out.println("skinmassage cost 3000");
        setPrice(3000f);
        // TODO Auto-generated constructor stub
    }


    
}