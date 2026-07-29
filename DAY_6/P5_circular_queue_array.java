package DAY_6;

class Circular_queue_array {
    int size;
    int front;
    int rear;
    int[] data;

    Circular_queue_array(int size) {
        this.size = size;
        front = -1;
        rear = -1;
        data = new int[size];
    }

    void enqueue(int value) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is Full!");
            return;
        }

        if (front == -1) {
            front = 0;
            rear = 0;
        } else {
            rear = (rear + 1) % size;
        }

        data[rear] = value;
    }

    int dequeue() {
        if (rear == -1) {
            System.out.println("Queue is Empty!");
            return -1;
        }

        int val = data[front];

        if (rear == front) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % size;
        }

        return val;
    }

    int frontData() {
        if (rear == -1) {
            System.out.println("Q is Empty");
            return -1;
        }
        return data[front];
    }

    int rearData() {
        if (rear == -1) {
            System.out.println("Q is Empty");
            return -1;
        }
        return data[rear];
    }

    void displayAll() {
        if (rear == -1) {
            System.out.println("Queue is Empty!");
            return;
        }

        int i = front;
        while (true) {
            System.out.print(data[i] + " ");
            if (i == rear)
                break;
            i = (i + 1) % size;
        }
        System.out.println();
    }
}

public class P5_circular_queue_array {
    public static void main(String[] args) {

        Circular_queue_array Q = new Circular_queue_array(4);

        Q.enqueue(10);
        Q.enqueue(20);
        Q.enqueue(30);
        Q.enqueue(40);

        System.out.println("Front Data: " + Q.frontData());
        System.out.println("Rear Data: " + Q.rearData());

        System.out.println("Removed Data " + Q.dequeue());
        System.out.println("Removed Data " + Q.dequeue());

        Q.enqueue(50);

        System.out.println("Front Data: " + Q.frontData());
        System.out.println("Rear Data: " + Q.rearData());

        Q.displayAll();
    }
}