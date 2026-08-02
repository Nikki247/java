package DAY_7;

public class P3_insertion_sort {

    public static void main(String[] args) {


        int[] a = {4, 7, 2, 8, 1, 5};


        int[] insertion_a = insertion(a);
        System.out.print("Insertion unSorted Array: ");
        System.out.print(a + " ");

        System.out.print("Insertion Sorted Array: ");
        for (int i : insertion_a) {
            System.out.print(i + " ");
        }
    }

    public static int[] insertion(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        return arr;
    }
}