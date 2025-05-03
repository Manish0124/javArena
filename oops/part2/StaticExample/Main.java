package oops.part2.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human sinchin = new Human(19, "sinchin", 1222, false);
        Human binchin = new Human(29, "binchin", 12232, true);


    
        // System.out.println(Human.population);
        // System.out.println(Human.population);

        Main funn = new Main();
        funn.fun2();
    }


    //this is not depend on objects
   static void fun(){
    //   greeting();   //you cannot use it because it requires an instance
      //but the function you are using it in does not depend on instance


    //you cannot access non-static stuff without referencing their instance in 
    // a static context  

    //hence their i referencing it
     Main obj = new Main();

     obj.greeting();

   }

   void fun2(){
    greeting();
   }


   // we know that the something which is non-static belongs to an object
   void greeting(){
    // fun();
    System.out.println("i am greeting");
   }

}
