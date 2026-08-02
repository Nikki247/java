package DAY_10;

public class P2_diff_Array {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        int[] diff = new int[n];

        // Create Difference Array
        diff[0] = arr[0];
        for (int i = 1; i < n; i++) {
            diff[i] = arr[i] - arr[i - 1];
        }

        int L = 1;
        int R = 3;
        int val = 5;

        // Update Difference Array
        diff[L] += val;
        if (R + 1 < n) {
            diff[R + 1] -= val;
        }

        // Reconstruct Original Array
        int[] result = new int[n];
        result[0] = diff[0];

        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] + diff[i];
        }

        System.out.println("Updated Array:");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}