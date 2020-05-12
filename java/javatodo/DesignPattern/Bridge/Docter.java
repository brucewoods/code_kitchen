package DesignPattern.Bridge;

public class Docter implements PersonToBridge {

    @Override
    public void waitForPickUp() {
        // TODO Auto-generated method stub
        System.out.println("docker waiting");
    }

    @Override
    public void followToDo() {
        // TODO Auto-generated method stub
        System.out.println("docter following to heal someone");

    }
    

}