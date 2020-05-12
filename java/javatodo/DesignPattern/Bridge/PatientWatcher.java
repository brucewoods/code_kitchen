package DesignPattern.Bridge;

public class PatientWatcher extends Picker {

    public PatientWatcher(PersonToBridge p) {
        super(p);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void guidTo(String somewhere) {
        // TODO Auto-generated method stub
        System.out.println("patient watcher guding docter to heal");
        person.followToDo();
         
    }
 
}