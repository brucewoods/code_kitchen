package DesignPattern.Bridge;

public class DealerPicker extends Picker {

    public DealerPicker(PersonToBridge p) {
        super(p);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void guidTo(String somewhere) {
        // TODO Auto-generated method stub
       System.out.println("picker guiding drugdealler to the drugmarket to deal");
       person.followToDo();
    }
    
}