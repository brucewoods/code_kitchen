package DesignPattern.Adapter;

public class Adapter implements Tap {
     
    private final Tube6 t6 = new Tube6();
    private final Tube8 t8 = new Tube8();

    @Override
    public int WaterOutput(  int tp) {
        // TODO Auto-generated method stub
        if(tp==4){
        return t6.OutputWater6cm()-2;
        }else  if(tp==6){
        return t8.OutputWater8cm()-4;
        }
        return 0;
    }
    

}