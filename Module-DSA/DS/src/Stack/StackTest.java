package Stack;


class MyStack{
	int top;
	int max;
	int[] arrStack;
	public MyStack(int size) {
		this.max=size;
		arrStack=new int[max];
		top=-1;
	}
	
	void push(int data) {
		
		if(top==max-1) {
			System.out.println("Stack is Full!");
		}
		else {
		//	top++;
		//	arrStack[top]=data;
			arrStack[++top]=data;
		}
		
	}
	
	int pop() {
		if(top==-1) {
			System.out.println("Stack is empty");
			return -1;
		}else {
			return arrStack[top--];
		}
	}
	
	int peep() {
		if(top==-1) {
			System.out.println("Stack is empty");
			return -1;
		}else {
			return arrStack[top];
		}
	}
	
	void display() {
		for(int i=top;i>=0;i--) {
			System.out.print(" "+this.arrStack[i]);
		}
	}
	
}
public class StackTest {

	public static void main(String[] args) {
		
		MyStack s1 = new MyStack(5);
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.push(60);
		s1.push(70);
		
		s1.display();
		
		System.out.println("Popped: "+s1.pop());
		System.out.println();
		System.out.println("Peeped: "+s1.peep());
	}
}
