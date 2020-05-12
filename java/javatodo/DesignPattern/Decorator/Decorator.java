package DesignPattern.Decorator;

public   class Decorator  extends Modeling{
      
    private Modeling model;
    public Decorator(Modeling model){
        this.model=model;
    }
    @Override
    public void show() {
        // TODO Auto-generated method stub

    }

    @Override
    public float cost() {
        // TODO Auto-generated method stub
       var money=super.getPrice()+model.cost();
       System.out.printf("cost  %{0.00}  \r\n" , money);
       return  money;
    }
    

}