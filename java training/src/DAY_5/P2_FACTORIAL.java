package DAY_5;

import java.util.Scanner;

public class P2_FACTORIAL {
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main() {
        System.out.println("enter a factorial number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = factorial(n);

        System.out.println("the factorial value is:" +fact);

    }
}
