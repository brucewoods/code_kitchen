package DesignPattern.Bridge;

public class DrugDealer implements PersonToBridge {

    @Override
    public void waitForPickUp() {
        // TODO Auto-generated method stub
        System.out.println("dealer waiting");

    }

    @Override
    public void followToDo() {
        // TODO Auto-generated method stub
        System.out.println("dealer following to deal drugs");

    }


    
}