package oops.part1;

public class wrapperExample {
    public static void main(String[] args) {

        int a = 34;
        int b = 12;

        swap(a, b);

        System.out.println( a + " " + b);
        

        //you cannot change the final keyword
        /*final int increment = 5;
        increment = 8;*/


       final A rohan = new A("sinchin");
         
       rohan.name = "other name";

        
       A obj;
       //when a non primitive  is final , you cannot reassign it 
    //    rohan = new A("new object");


    // here automatically called the destructor 

    //you can say what to do when memory is free 
    //   for (int i = 0; i < 1000000; i++) {
    //      obj = new A("random name");
    //   }

        
        
    }
    
   static void swap(int a , int b ){
     int temp = a;
     a =b;
     b = temp;
   }

  

}

class A {
 
    final int num = 10;
    String name;

    public A (String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        System.out.println("object is destroyed");
    }
    
}

