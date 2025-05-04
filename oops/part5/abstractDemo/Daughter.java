package oops.part5.abstractDemo;

public class Daughter extends Parent {

    public Daughter(int age){
       super(age);
    }

     @Override
     void career(){
       System.out.println("i want to be coder");
     }

     @Override
     void partner(){
       System.out.println("i love the captain cool , ");
     }

}