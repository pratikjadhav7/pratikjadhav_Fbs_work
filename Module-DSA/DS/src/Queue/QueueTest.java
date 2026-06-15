package Queue;

class MyQueue{
	int front;
	int []arrQueue;
	int max;
	int end;
	
	MyQueue(int size){
		this.front=-1;
		this.max=size;
		this.arrQueue=new int[max];
		this.end=-1;
	}
	
	void push(int data) {
		if(this.end==max-1) {
			System.out.println("Queue is full !");
		}
		if(this.front==-1) {
			this.front++;
		}
		
		arrQueue[++end]=data;
		
	}
		
	int pop() {
		
		if(this.front==-1  && this.end==-1) {
			System.out.println("Queue is empty!");
			return -1;
		}
		else {
			return this.arrQueue[front++];
		}
		
	}
	
	int peep() {
		if(this.front==-1  && this.end==-1) {
			System.out.println("Queue is empty!");
			return -1;
		}
		else {
			return this.arrQueue[front];
		
	    }
	}
	void display() {
		
		for(int i=front;i<=end;i++) {
			System.out.print(" "+this.arrQueue[i]);
		}
		
	}
}
public class QueueTest {
	public static void main(String[] args) {
		
		MyQueue q1 = new MyQueue(5);
		
		q1.push(10);
		q1.push(20);
		q1.push(30);
		q1.push(40);
		q1.push(50);
		//q1.push(60);
		
		q1.display();
		
		System.out.println("\nPopped: "+q1.pop());
		
		q1.display();
		
		System.out.println("\nPeeped: "+q1.peep());
		
	}

}
