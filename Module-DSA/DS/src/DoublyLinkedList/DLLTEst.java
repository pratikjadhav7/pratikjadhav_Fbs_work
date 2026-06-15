package DoublyLinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node pre;

    Node(int data) {
        this.data = data;
    }
}

class DLL {
    Node start;

    void insertAtEnd(int data) {
        Node nn = new Node(data);

        if (start == null) {
            start = nn;
            return;
        } else {
            Node end = start;

            while (end.next != null) {
                end = end.next;
            }
            end.next = nn;//connects node to list
            nn.pre=end;//connects list to end
            
        }

        System.out.println("Inserted Successfully!");
    }

    void insertAtBeg(int data) {
        Node nn = new Node(data);

        if (start == null) {
            start = nn;
            return;
        } else {
            nn.next = start;//to connect node with list
            start.pre = nn;// to connect list with node
            start = nn;//to make new node as start
        }

        System.out.println("Inserted Successfully!");
    }

  void deleteFromBeg() {
    	if(start==null) {
    		System.out.println("List is empty");
    		return;
    	}
    	
    	System.out.println(start.data+" deleted!");
    	start=start.next;
    	
    	 if(start != null) {
    	        start.pre = null;
    	    }
    }
    
  void deleteFromEnd() {

    if (start == null) {
        System.out.println("List is empty");
        return;
    }

    if (start.next == null) {
        System.out.println(start.data + " deleted!");
        start = null;
        return;
    }

    Node temp = start;

    // Move to last node
    while (temp.next != null) {
        temp = temp.next;
    }

    System.out.println(temp.data + " deleted!");

    // Remove last node
    temp.pre.next = null;
}
   
/*  
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
    
    */
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

  
		  void reverse() {
		
			    Node temp = null;
			    Node curr = start;
		
			    while (curr != null) {
		
			        // Swap pre and next
			        temp = curr.pre;
			        curr.pre = curr.next;
			        curr.next = temp;
		
			        // Move to next node in original list
			        curr = curr.pre;
			    }
		
			    // Update head
			    if (temp != null) {
			        start = temp.pre;
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
  
    void display() {
        if (start == null) {
            System.out.println("List is Empty!");
            return;
        }

        Node temp = start;

        while (temp.next != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println(temp.data);
    }
    
    void displayReverse() {

        if (start == null) {
            System.out.println("List is Empty!");
            return;
        }

        Node temp = start;

        // Move to last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Traverse backward
        while (temp != null) {
            System.out.print(temp.data);

            if (temp.pre != null) {
                System.out.print(" <-> ");
            }

            temp = temp.pre;
        }

        System.out.println();
    }
}

public class DLLTEst {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DLL sll = new DLL();

        int choice;

        do {
            System.out.println("\n===== Doubly Linked List Menu =====");
            System.out.println("1. Insert At End");
            System.out.println("2. Insert At Beginning");
            System.out.println("3. Search Element");
            System.out.println("4. Delete from Beginning");
            System.out.println("5. Delete From End");
            System.out.println("6. Reverse List");
            System.out.println("7. Display the List");
            System.out.println("8. Display List in Reverse");
            System.out.println("9. Sort the List");
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
            	sll.deleteFromBeg();
            	break;
            	
            case 5:
            	sll.deleteFromEnd();
            	break;
            case 6:
            	sll.reverse();
            	System.out.println("Reversed List: ");
            	sll.display();
            	break;
            	
            case 7:
                System.out.println("Linked List:");
                sll.display();
                break;

            case 8:
            	System.out.println("Displayed List in Reverse: ");
            	sll.displayReverse();
            	break;
            	
            case 9:
            	sll.sort();
            	System.out.println("Sorted List: ");
            	sll.display();
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