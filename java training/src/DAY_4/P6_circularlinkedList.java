
package DAY_4;

class cNode {
    int data;
    cNode next;

    cNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class circularLinkedList {
    cNode head;

    public void add(int data) {
        cNode newNode = new cNode(data);

        if (head == null) {
            head = newNode;
            head.next = head;
            return;
        }

        cNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head;
    }

    public void traverse() {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }

        cNode temp = head;
        do {
            System.out.println(temp.data + " --> ");
            temp = temp.next;
        } while (temp != head);
    }
}

public class P6_circularlinkedList {
    public static void main(String[] args) {

        circularLinkedList cl = new circularLinkedList();

        cl.add(12);
        cl.add(34);
        cl.add(35);
        cl.add(191);

        cl.traverse();
    }
}