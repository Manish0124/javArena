package oops.part5.Interfaces;

public class Car implements Brake,Engine {
 
    @Override
    public void brake(){
        System.out.println("i am brake in normal car");
    }
    @Override
    public void start(){
        System.out.println("i am start in normal car");
    }
    @Override
    public void stop(){
        System.out.println("i am stop in normal car");
    }
    @Override
    public void acc(){
        System.out.println("i am accelerate in normal car");
    }
    
}