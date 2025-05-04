package rufandtuf;

import oops.part4.access.A;

public class SubClass extends A{

   public SubClass(int num , String name){
        super(num, name);


    }

    public static void main(String[] args) {
        SubClass obje = new SubClass(13, "muttuswai");
        int n = obje.num;
    }
    
}
