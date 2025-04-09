package practiceStuff;

import java.util.Scanner;

public class max {

    public static void main(String[] args) {
        // int[] arr=  {4 ,7,-3,40, 6, 3, 1};
        Scanner scanner = new Scanner(System.in);

        // Read number of test cases
        int T = scanner.nextInt();

        // Process each test case
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); 
            int maxHeight = Integer.MIN_VALUE;


            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scanner.nextInt();

                if (arr[i]>maxHeight) {
                   maxHeight = arr[i]; 
                }
            }


            System.out.println(maxHeight);
        }

        scanner.close();
    }
            

     
}