package DAY_6;

class queue_array {
    int size;
    int front;
    int rear;
    int[] data;

    queue_array(int size) {
        this.size = size;
        front = 0;
        rear = -1;
        data = new int[size];
    }

    void enqueue(int value) {
        if (rear > size - 1) {
            System.out.println("Queue is Full!");
        }
        rear++;
        data[rear] = value;
    }

    int dequeue() {
        if (front > rear) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        int val = data[front];
        front++;
        return val;
    }

    int frontData() {
        if (front > rear) {
            System.out.println("Front Data is Empty");
            return -1;
        }
        return data[front];
    }

    int rearData() {
        if (rear == -1) {
            System.out.println("rear Data is Empty");
            return -1;
        }
        return data[rear];
    }

    void displayAll() {
        if (front > rear) {
            System.out.println("Queue is Empty!");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}

public class P4_queue_Array {
    public static void main(String[] args) {

        queue_array Q = new queue_array(10);

        Q.enqueue(10);
        Q.enqueue(20);
        Q.enqueue(30);
        Q.enqueue(40);

        System.out.println("Front Data: " + Q.frontData());
        System.out.println("Rear Data: " + Q.rearData());

        Q.displayAll();

        Q.dequeue();
        Q.dequeue();

        Q.displayAll();
    }
}