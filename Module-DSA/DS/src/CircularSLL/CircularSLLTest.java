package CircularSLL;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class CircularLinkedList {
    Node start;

    // Insert at Beginning
    void insertAtBeg(int data) {
        Node nn = new Node(data);

        if (start == null) {
            start = nn;
            nn.next = start;
            return;
        }

        Node temp = start;

        while (temp.next != start) {
            temp = temp.next;
        }

        nn.next = start;
        temp.next = nn;
        start = nn;

        System.out.println("Inserted at Beginning Successfully!");
    }

    // Insert at End
    void insertAtEnd(int data) {
        Node nn = new Node(data);

        if (start == null) {
            start = nn;
            nn.next = start;
            return;
        }

        Node temp = start;

        while (temp.next != start) {
            temp = temp.next;
        }

        temp.next = nn;
        nn.next = start;

        System.out.println("Inserted at End Successfully!");
    }

    // Delete from Beginning
    void deleteFromBeg() {

        if (start == null) {
            System.out.println("List is Empty");
            return;
        }

        if (start.next == start) {
            start = null;
            System.out.println("Deleted Successfully!");
            return;
        }

        Node last = start;

        while (last.next != start) {
            last = last.next;
        }

        start = start.next;
        last.next = start;

        System.out.println("Deleted Successfully!");
    }

    // Delete from End
    void deleteFromEnd() {

        if (start == null) {
            System.out.println("List is Empty");
            return;
        }

        if (start.next == start) {
            start = null;
            System.out.println("Deleted Successfully!");
            return;
        }

        Node temp = start;

        while (temp.next.next != start) {
            temp = temp.next;
        }

        temp.next = start;

        System.out.println("Deleted Successfully!");
    }

    // Display
    void display() {

        if (start == null) {
            System.out.println("List is Empty");
            return;
        }

        Node temp = start;

        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != start);

        System.out.println("(Back to Start)");
    }
}

public class CircularSLLTest {

    public static void main(String[] args) {

        CircularLinkedList cll = new CircularLinkedList();

        cll.insertAtEnd(10);
        cll.insertAtEnd(20);
        cll.insertAtEnd(30);

        System.out.println("After Insertions:");
        cll.display();

        cll.insertAtBeg(5);

        System.out.println("\nAfter Insert At Beginning:");
        cll.display();

        cll.deleteFromBeg();

        System.out.println("\nAfter Delete From Beginning:");
        cll.display();

        cll.deleteFromEnd();

        System.out.println("\nAfter Delete From End:");
        cll.display();
    }
}