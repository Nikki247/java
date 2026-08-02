package DAY_10;

public class P3_fibDP {
    public static void main() {
        int n = 9;
        int [] dp = new int[n+1];
        System.out.println(fib(n,dp));
        for(int i:dp) {
            System.out.print(i +" ");

        }
        System.out.println();


    }
    public static int fib(int n,int[] dp) {
        if(n<=0)
        return 1;
        if(dp[n]!=0)
            return dp[n];
        return dp[n] = fib(n-1,dp) + fib(n-2,dp);
    }
}
