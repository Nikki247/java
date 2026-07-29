package DAY_6;

import java.util.Stack;

public class P3_stack3 {
    public static void main() {
        Stack<Integer> st = new Stack<>();

        st.push(12);
        st.push(23);
        st.push(22);

        System.out.println(st.peek());

        for(int i=0;i<st.size();i++) {
            System.out.println(st.get(i) + " ");

        }
        System.out.println();
    }
}
