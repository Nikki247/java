package DAY_4;

import java.util.ArrayList;

public class P2_LinearSearch {
public static void linearSearch(int[] arr, int ref) {
    ArrayList<Integer> arr1 = new ArrayList<Integer>();
    int n=0;
    for(int i=0; i<arr.length;i++) {
        if(ref == arr[i]) {
            arr1.add(i);
            n++;
        }
    }
    System.out.println("No of occurence:"+arr1.size());
    System.out.println("first occurence:"+arr1.get(0));
    System.out.println("last occurence:"+arr1.get(arr1.size()-1));
    for(int i:arr1) {
        System.out.println(i +" ");
    }

}
public static void main() {
    int arr[] ={10,10,30,40,10,60,70,80,90};
    int key = 10;
    linearSearch(arr,key);
}
}

