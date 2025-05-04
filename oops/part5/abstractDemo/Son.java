package oops.part5.abstractDemo;

public class Son extends Parent {

  public Son(int age){
    super(age);
  }
    
   @Override
   void career(){
     System.out.println(" i want to be  doctor" );
   }

   @Override
   void partner(){
     System.out.println("i love , iron man "  );
   }

}
