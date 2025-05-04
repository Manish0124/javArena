package oops.part4.access;

public class SubClass extends A{


    public SubClass(int num , String name){
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(34, "llb");
        int num = obj.num;
    }

}
