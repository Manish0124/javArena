package oops.part4.access;

public class A {

   protected int num;
    String name;
    int[] arr;

  
    // this is getter function
    public int  getNum(){
        return num;
    }
    //this is setter function
    public void setNum(int num){
        this.num = num; 
    }

    public A(int num, String name){
       this.num = num;
       this.name = name;
       this.arr = new int[num];
    }


    public static void main(String[] args) {
        A aa = new A(1, "mohin");
        int n = aa.num;
    }

}
