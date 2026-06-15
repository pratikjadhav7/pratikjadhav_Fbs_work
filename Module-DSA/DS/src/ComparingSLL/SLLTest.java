package ComparingSLL;

public class SLLTest {
public static void main(String[] args) {
	
	boolean compare(SinglyLinkedList list2) {

	    Node temp1 = this.start;
	    Node temp2 = list2.start;

	    while (temp1 != null && temp2 != null) {

	        if (temp1.data != temp2.data) {
	            return false;
	        }

	        temp1 = temp1.next;
	        temp2 = temp2.next;
	    }

	    if (temp1 == null && temp2 == null) {
	        return true;
	    }

	    return false;
	}
  }
}
