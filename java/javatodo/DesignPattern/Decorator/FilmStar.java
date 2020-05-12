package DesignPattern.Decorator;

public class FilmStar extends Modeling {
    
    public FilmStar(){
        super();
        System.out.println(" FilmStart cost 5000");
        setPrice(5000f);
    }
    @Override
    public void show() {
        
       
        
    }

    @Override
    public float cost() {
        // TODO Auto-generated method stub
       return  super.getPrice();
    }
    
}