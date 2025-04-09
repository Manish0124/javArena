package practiceStuff;

import java.util.Scanner;

//unsolved 

public class string {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            System.out.println(s);

          
            // 00 is replaced with A
            // 01 is replaced with T
            // 10 is replaced with C
            // 11 is replaced with G
           
            // for (String str : s) {
                
            // }

            switch (s) {
                case "00":
                    System.out.println("A");
                    break;
                case "01":
                    System.out.println("T");
                    break;
                case "10":
                    System.out.println("C");
                    break;
                case "11":
                    System.out.println("G");
                    break;
            
                default:
                    break;
            }
            
           
        }
    }
}

