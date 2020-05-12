package DesignPattern.Bridge;

public abstract class Picker {
     
       PersonToBridge  person;
     public Picker(PersonToBridge p){
         this.person=p;
     }
     public abstract void  guidTo(String somewhere);
}