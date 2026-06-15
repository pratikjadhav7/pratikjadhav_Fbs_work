package CircularQueue;


class CircularQueue{
	int front;
	int rare;
	int max;
	int[] arrQueue;
	
	public CircularQueue(int size) {
		// TODO Auto-generated constructor stub
		this.front=-1;
		this.rare=-1;
		this.max=size;
		this.arrQueue=new int[max];
	}
	
		
	boolean isEmpty() {
			if(front==-1 && rare==-1) {
				return true;
			}else {
				return false;
			}
		}
		
	boolean isFull() {
			if((front==0 && rare==max-1)||front==rare+1) {
				return true;
			}else {
				return false;
			}
		}
	
	
	void push(int data) {
		if(isFull()) {
			System.out.println("Queue is Full");
		}
		
		else if(isEmpty()) {
				front=rare=0;
		}
		
		else if(rare==max-1) {
			rare=0;
		}
		
		else {
			rare++;
		}
		
		arrQueue[rare]=data;
		
	}
	
	void pop() {
		if(isEmpty()) {
			System.out.println("Queue is empty!");
		}
		
		else {
			int elm=arrQueue[front];
			
			if(front==rare) {
				front=rare=-1;
			}
			
			else if(front==max-1) {
				front=0;
			   }
			else {
				front++;
			}
			System.out.println(elm+" deleted successfully!");
		}
	}
	
	void display() {
		if(isEmpty()) {
			System.out.print("No element to display");
		}else {
			int i=front;
			
			while(i!=rare) {
				System.out.print(" "+arrQueue[i]);
				if(i==max-1) {
					i=0;
				}else {
					i++;
				}
			}
			System.out.print(" "+arrQueue[i]);
		}
	}
		
}
public class CircularQueue1 {

	public static void main(String[] args) {
		
		CircularQueue q = new CircularQueue(5);
		
		q.push(10);
		q.push(20);
		q.push(30);
		q.push(40);
		q.push(50);
		
		q.display();
		
		q.pop();
		q.pop();
		
		q.display();
	}
}
