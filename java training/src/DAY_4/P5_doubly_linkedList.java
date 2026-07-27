package DAY_4;

class dNode {
    int data;
    dNode prev;
    dNode next;

    dNode(int d) {
        this.data = d;
        this.prev = null;
        this.next = null;
    }
}

class doublyLinkedList {

    dNode head;

    public void add(int data) {
        dNode newNode = new dNode(data);

        if (head == null) {
            head = newNode;
            return;
        }

        dNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    public void forwardTraversal() {
        if (head == null) {
            return;
        }

        dNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }

        System.out.println("null");
    }
}

public class P5_doubly_linkedList {

    public static void main(String[] args) {

        doublyLinkedList DL = new doublyLinkedList();

        DL.add(12);
        DL.add(17);
        DL.add(65);
        DL.add(123);
        DL.add(76);

        DL.forwardTraversal();
    }
}
