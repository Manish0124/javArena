public class FiboUsingdp {
    
    static int[] dp;
    public int fibo(int n){
        
        // base condtion
        if(n<=1) return n;
        
        
        // check in array if it is already present then simply return that value to avoid repeadely calls
        if(dp[n]!=0) return dp[n];
        return dp[n] = fibo(n-1) + fibo(n-2);

    }
    public static void main(String[] args) {
    
          
    dp = new int[100];
    FiboUsingdp obj = new FiboUsingdp();
    int n = 5;
    System.out.println(obj.fibo(n));

   

    }
}