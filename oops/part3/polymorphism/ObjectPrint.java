package oops.part3.polymorphism;

public class ObjectPrint {
    
   int num;

   public ObjectPrint(int num){
    this.num = num;
   }


   //we are overriding the orignal obj...
   @Override
   public String toString(){
      return "ObjectPrint{" + 
         "num=" + num + '}';
   }

   public static void main(String[] args) {
    ObjectPrint obj = new ObjectPrint(34);
    System.out.println(obj);
   }

}
