package DAY_4;

import java.util.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class linkedList {

    Node head;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public void displayData() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.print("null\n");
    }
}

public class P4_singlyLinkedList {

    public static void main(String[] args) {

        linkedList L1 = new linkedList();

        L1.add(3);
        L1.add(13);
        L1.add(24);
        L1.add(105);
        L1.displayData();

        L1.add(1020);
        L1.add(2);
        L1.displayData();
    }
}