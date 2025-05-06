package rufandtuf;
import java.util.Scanner; 

public class first {

    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();
        max();
        
    }


    static void max(){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if ((a>b) &&(a>c)){
            System.out.println("the number is a="+a);

        }
        
        else if ((b>a) &&(b>c)){
            System.out.println("the number is b="+b);

        }
        
        
        else{
            System.out.println("the number is c="+c);
        }
        
            
    }
}