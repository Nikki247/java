package DAY_5;

import java.util.Scanner;

public class P3_rec1 {
    public static int recMethod(int n, int rev) {
        if(n==0)
            return rev;
        rev = rev*10 + n%10;
        return recMethod(n/10, rev);
    }
    public static void main() {
        int rev = 0;
        System.out.println("enter the valueof N:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = recMethod(n,rev);

        System.out.println("the factorial value is:" +fact);
    }
}
