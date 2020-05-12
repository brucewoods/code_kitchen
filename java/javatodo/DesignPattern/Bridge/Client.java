package DesignPattern.Bridge;

import org.junit.Test;

public class Client {
   
    
    @Test
    public void Test(){

        Picker  patientPicker=new PatientWatcher(new Docter());
        patientPicker.guidTo("dying patient");

        System.out.println("=================");
        
        Picker  dealerPicker=new DealerPicker(new DrugDealer());
        dealerPicker.guidTo("drug market");
    }
}