package DAY_5;

import java.util.ArrayList;

public class p4_ArrayList {
    public static void main() {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<10;i++) {
            arr.add(i);
        }
        for(int i:arr) {
            System.out.println(i+" ");
        }
    }
}
