package DAY_5;

import java.util.Scanner;

public class P1_recursion {
    public static int recMethod(int n) {
        // base conditon
        if(n==1) {
            return 1;
        }
        return n + recMethod(n-1);
    }
    public static void main() {
        System.out.print("Enter the value of N:");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Sum = recMethod(N);
        System.out.println("sum of N natural number:" +Sum);

    }




}
