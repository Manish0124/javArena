package practiceStuff.ArraysQ;

import java.util.Scanner;

public class coupon {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            int sum = 0;

            //to get total sum 
            
            for (int i = 0; i < n ; i++ ){
                sum+=a[i];
            } 

            

            //to get discount
            int discountPrice = 0;
            for (int i = 0; i < n ; i++ ){
                if (a[i] > y) {
                    a[i]-=y;
                    
                }
    
                else{
                    a[i]=0;
                }

                discountPrice+=a[i];

            } 
            
            System.out.println(discountPrice);

            int totalDiscountPrice = x + discountPrice;
        
           
            if (totalDiscountPrice<sum) {
                System.out.println("applied");
            }
            else{
                System.out.println("not applied");
            }
          
           
           
        }
    }
    }

