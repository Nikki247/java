package DAY_6;

class stack {
    int size;
    int top;
    int[] sdata;

    stack(int size) {
        this.size = size;
        top = -1;
        sdata = new int[size];
    }
    boolean isEmpty() {
        return (top == -1)?true:false;
    }
    boolean isfull() {
        return(top >= this.size-1)?true:false;
    }
    void push(int value) {
        if(isfull()) {
            System.out.println("Stack is full!");
            return;
        }
        top++;
        sdata[top] = value;

    }
    int pop() {
        if(isEmpty()) {
            System.out.println("stack is empty");
            return -1;
        }
        int val = sdata[top];
        top--;
        return val;
    }
    int peak() {
        if (isEmpty()) {
            System.out.println("stack is Empty!!");
            return -1;

        }
        return sdata[top];
    }
        void display() {
            if(isEmpty()) {
                System.out.println("stack is empty");
                return;


            }
            for(int i=top;i>=0;i--) {
                System.out.println(sdata[i]);
            }
        }
    }


public class P1_stack {
    public static void main() {
        stack st = new stack(10);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();
        st.pop();
        st.display();


    }
}
