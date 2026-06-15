package SinglyLinkedList;

import java.util.Stack;
import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class SLL {
    Node start;

    void insertAtEnd(int data) {
        Node nn = new Node(data);

        if (this.start == null) {
            this.start = nn;
        } else {
            Node end = start;

            while (end.next != null) {
                end = end.next;
            }
            end.next = nn;
        }

        System.out.println("Inserted Successfully!");
    }

    void insertAtBeg(int data) {
        Node nn = new Node(data);

        nn.next = start;
        start = nn;

        System.out.println("Inserted Successfully!");
    }

    void deleteFromBeg() {
    	if(start==null) {
    		System.out.println("List is empty");
    		return;
    	}
    	
    	System.out.println(start.data+" deleted!");
    	start=start.next;
    }
    
    void deleteFromEnd() {
    	
    	if(start==null) {
    		System.out.println("List is empty");
    		return;
    	}
    	
    	if(start.next==null) {
    		System.out.println(start.data+" deleted!");
    		start=null;
    		//or start=start.next;
    	    return;
    	}
    	
    	Node temp = start;
    	
    	while(temp.next.next!=null) {
    		temp=temp.next;
    	}
    	temp.next=null;
    	//or temp.next=temp.next.next;
    }
    
    void deleteByValue(int data) {

        if (start == null) {
            System.out.println("List is empty!");
            return;
        }

        // If first node contains the data
        if (start.data == data) {
            System.out.println(start.data + " deleted!");
            start = start.next;
            return;
        }

        Node temp = start;

        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Element not found!");
        } else {
            System.out.println(temp.next.data + " deleted!");
            temp.next = temp.next.next;
        }
    }
    
    void sort() {
        if (start == null || start.next == null) {
            return;
        }

        Node current, index;
        int temp;

        for (current = start; current != null; current = current.next) {
            for (index = current.next; index != null; index = index.next) {

                if (current.data > index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
            }
        }
    }
    
    void reverse() {
        Node prev = null;
        Node curr = start;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        start = prev;
    }
    
    boolean search(int elm) {
        if (start == null) {
            System.out.println("List is Empty!");
            return false;
        }

        Node temp = start;

        while (temp != null) {
            if (temp.data == elm) {
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    void display() {
        if (start == null) {
            System.out.println("List is Empty!");
            return;
        }

        Node temp = start;

        while (temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println(temp.data);
    }
    
 /*   void displayRev(Node temp) {
        if (temp == null)
            return;

        if (temp.next != null) {
            displayRev(temp.next);
            System.out.print(" -> ");
        }

        System.out.print(temp.data);
    }*/

    void displayRev() {

        if (start == null) {
            System.out.println("List is Empty!");
            return;
        }

        Stack<Integer> mystack = new Stack<>();

        Node temp = start;

        while (temp != null) {
            mystack.push(temp.data);
            temp = temp.next;
        }

        while (!mystack.isEmpty()) {
            System.out.print(mystack.pop() + " ");
        }

        System.out.println();
    }
}

public class SinglyLinkedList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SLL sll = new SLL();

        int choice;

        do {
            System.out.println("\n===== Singly Linked List Menu =====");
            System.out.println("1. Insert At End");
            System.out.println("2. Insert At Beginning");
            System.out.println("3. Search Element");
            System.out.println("4. Delete Element");
            System.out.println("5. Delete By Value");
            System.out.println("6. Sort List");
            System.out.println("7. Reverse List");
            System.out.println("8. Display List");
            System.out.println("9. Display List in Reverse");
            System.out.println("10. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:
                System.out.print("Enter Data: ");
                int endData = sc.nextInt();
                sll.insertAtEnd(endData);
                break;

            case 2:
                System.out.print("Enter Data: ");
                int begData = sc.nextInt();
                sll.insertAtBeg(begData);
                break;

            case 3:
                System.out.print("Enter Element To Search: ");
                int elm = sc.nextInt();

                if (sll.search(elm)) {
                    System.out.println("Element Found!");
                } else {
                    System.out.println("Element Not Found!");
                }
                break;

            case 4:
                System.out.println("1. Delete From Beginning");
                System.out.println("2. Delete From End");
                System.out.print("Enter Choice: ");

                int delChoice = sc.nextInt();

                if(delChoice == 1) {
                    sll.deleteFromBeg();
                }
                else if(delChoice == 2) {
                    sll.deleteFromEnd();
                }
                else {
                    System.out.println("Invalid Choice!");
                }
                break;
            	
            case 5:
            	System.out.print("Enter element to delete: ");
                int delData = sc.nextInt();
                sll.deleteByValue(delData);
                break;
                
            case 6:
                sll.sort();
                System.out.println("Sorted List:");
                sll.display();
                break;
            	
            case 7:
                sll.reverse();
                System.out.println("Reversed List:");
                sll.display();
                break;
            	
            case 8:
                System.out.println("Linked List:");
                sll.display();
                break;

            case 9:
            	System.out.println("Displayed List in Reverse:");
            	//sll.displayRev(sll.start);
            	sll.displayRev();
            	break;
            	
            case 10:
                System.out.println("Program Ended!");
                break;

            default:
                System.out.println("Invalid Choice!");
            }

        } while (choice != 10);

        sc.close();
    }
}