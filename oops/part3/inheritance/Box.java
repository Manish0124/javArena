package oops.part3.inheritance;

public class Box {
   private double l;
    double w;
    double h;


    public static void greeting(){
      System.out.println("i am in Box class Greeting ! ");
    }


   Box(){
    this.l = -1;
    this.w = -1;
    this.h = -1;
   }

   //cube 

   Box(double side){
    this.l = side;
    this.w = side;
    this.h = side;
   }


   Box(double l , double w , double h){
    this.l = l;
    this.w = w;
    this.h = h;
   }

   //copy constructor 

   Box(Box old){
    this.l = old.l;
    this.w = old.w;
    this.h = old.h;
   }

   public void information(){
    System.out.println("running the box");
   }


    

}
