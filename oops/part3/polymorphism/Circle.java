package oops.part3.polymorphism;

public class Circle extends Shapes{

    //this will run when obj of circle is created
    //hence it is overriding the patent method


    @Override  //this is called annotation
    void area(){
        System.out.println("area is pie*r*r ");
    }
}
