package CircularQueue;

class MyCircularQueue {
    int front;
    int end;
    int max;
    int[] arrQueue;
    int size;

    public MyCircularQueue(int size) {
        this.max = size;
        this.arrQueue = new int[max];
        this.front = 0;
        this.end = -1;
        this.size = 0;
    }

    void push(int data) {
        if (size == max) {
            System.out.println("Queue is Full!");
            return;
        }

        end = (end + 1) % max;
        arrQueue[end] = data;
        size++;
    }

    int pop() {
        if (size == 0) {
            System.out.println("Queue is Empty!");
            return -1;
        }

        int data = arrQueue[front];
        front = (front + 1) % max;
        size--;

        return data;
    }

    int peep() {
        if (size == 0) {
            System.out.println("Queue is Empty!");
            return -1;
        }

        return arrQueue[front];
    }

    void display() {
        if (size == 0) {
            System.out.println("Queue is Empty!");
            return;
        }

        System.out.print("Queue: ");

        for (int i = 0; i < size; i++) {
            System.out.print(arrQueue[(front + i) % max] + " ");
        }
        System.out.println();
    }
}

public class TestCircularQueue {
    public static void main(String[] args) {

        MyCircularQueue q = new MyCircularQueue(5);

        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);

        q.display();

        System.out.println("Popped: " + q.pop());
        System.out.println("Popped: " + q.pop());

        q.display();

        q.push(60);
        q.push(70);

        q.display();

        System.out.println("Peeped: " + q.peep());
    }
}