package DAY_7;

public class P2_Selection_Sort {
    public static void main() {
        int[] a = {10,9,11,2,3,0};
        int[] selection_a = selection(a);
        System.out.print("Selection Sorted Array: ");
        for(int i:selection_a) {
            System.out.print(i+ " ");
        }
        System.out.println();

    }

    public static int[] selection(int[] arr) {
        int minValueIndex;
        int n = arr.length;
        for(int i=0; i<arr.length;i++) {
            minValueIndex = i;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[j] < arr[minValueIndex]) {
                    minValueIndex = j;

                }
            }
            int temp = arr[i];
            arr[i] = arr[minValueIndex];
            arr[minValueIndex] = temp;
        }
        return arr;
    }
}
