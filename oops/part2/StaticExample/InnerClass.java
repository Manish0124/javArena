package oops.part2.StaticExample;

class Test{
 static String name;

  Test(String name){
    Test.name = name;
  }

public class InnerClass {
    
           

      public static void main(String[] args) {
         Test a = new Test("rohan");
         Test b = new Test("mohan");
         System.out.println(a.name);
         System.out.println(b.name);
      }
    }
}




