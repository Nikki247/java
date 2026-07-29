package DAY_6;

class sNode {
    int data;
    sNode next;

    sNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class stackLL {
    sNode top = null;

    boolean isEmpty() {
        return (top == null);
    }

    void pushData(int data) {
        sNode newNode = new sNode(data);
        newNode.next = top;
        top = newNode;
    }

    int popData() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }

        sNode temp = top;
        int val = temp.data;
        top = top.next;
        return val;
    }

    void displayAll() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return;
        }

        sNode temp = top;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class P2_stack1 {
    public static void main(String[] args) {

        stackLL stk = new stackLL();

        stk.pushData(10);
        stk.pushData(18);
        stk.pushData(33);

        stk.displayAll();

        stk.popData();

        stk.displayAll();
    }
}