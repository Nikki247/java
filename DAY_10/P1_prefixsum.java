package DAY_10;

public class P1_prefixsum {
    public void main(String[] args) {
        int[] arr = {3,6,2,8,9};
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i=1;i<n;i++) {
            prefix[i] = prefix[i-1] + arr[1];

        }
        int L = 1,R=3;
        int sum = (L == 0)? prefix[R] : prefix[R] - prefix[L-1];
        System.out.println("sum of range [" +L+", " +R+"] is:"+sum);
    }
}
