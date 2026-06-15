package EmployeeSinglyLinkedList;

import java.util.Scanner;

class Employee {
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee id=" + id + ", name=" + name + ", salary=" + salary;
	}
}

class Node {
	Employee data;
	Node next;

	public Node(Employee emp) {
		this.data = emp;
	}
}

class SLL {
	Node start;

	void insertAtEnd(Employee data) {
		Node nn = new Node(data);

		if (start == null) {
			start = nn;
			return;
		} else {

			Node end = start;

			while (end.next != null) {
				end = end.next;
			}
			end.next = nn;
		}
		System.out.println("Employee Added Successfully!");
	}

	void insertAtBeg(Employee data) {
		Node nn = new Node(data);

		nn.next = start;
		start = nn;
		System.out.println("Employee Added Successfully!");
	}

	void deleteFromBeg() {
		if (start == null) {
			System.out.println("List is Empty!");
			return;
		}
		start = start.next;
		System.out.println("Employee deleted Successfully!");
	}

	void deleteFromEnd() {
		if (start == null) {
			System.out.println("List is Empty");
			return;
		}

		if (start.next == null) {
			start = null;
			return;
		}

		Node temp = start;

		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;

		System.out.println("Employee deleted Successfully!");
	}

	void sortBySalary() {
		Node current, index;

		for (current = start; current != null; current = current.next) {
			for (index = current.next; index != null; index = index.next) {
				if (current.data.salary > index.data.salary) {
					Employee temp = current.data;
					current.data = index.data;
					index.data = temp;

				}
			}
		}

		System.out.println("Sorted  by Salary Successfully!");
	}

	void sortByID() {
		Node current, index;

		for (current = start; current != null; current = current.next) {
			for (index = current.next; index != null; index = index.next) {
				if (current.data.id > index.data.id) {
					Employee temp = current.data;
					current.data = index.data;
					index.data = temp;
				}
			}
		}
		System.out.println("Sorted by ID Successfully! ");
	}

	void sortByName() {
		Node current, index;

		for (current = start; current != null; current = current.next) {
			for (index = current.next; index != null; index = index.next) {
				if (current.data.name.compareTo(index.data.name) > 0) {
					Employee temp = current.data;
					current.data = index.data;
					index.data = temp;
				}
			}
		}
		System.out.println("Sorted by Name Successfully! ");
	}

	void display() {
		if (start == null) {
			System.out.println("List is Empty");
			return;
		}
		Node temp = start;

		while (temp.next != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.print(temp.data);
	}
}

public class EmployeeSLL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;

		SLL sll = new SLL();

		do {
			System.out.println("\n===== EMPLOYEE SLL MENU =====");
			System.out.println("1. Insert Employee At Beginning");
			System.out.println("2. Insert Employee At End");
			System.out.println("3. Delete Employee From End");
			System.out.println("4. Delete Employee From Beginning");
			System.out.println("5. Sort Employees");
			System.out.println("6. Display Employees");
			System.out.println("0. Exit");
			System.out.print("Enter Your Choice: ");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Employee ID:");
				int id = sc.nextInt();
				sc.nextLine();

				System.out.println("Enter Employee Name:");
				String name = sc.nextLine();

				System.out.println("Enter Employee Salary:");
				double salary = sc.nextDouble();

				sll.insertAtBeg(new Employee(id, name, salary));
				break;

			case 2:
				System.out.print("Enter Employee ID: ");
				id = sc.nextInt();
				sc.nextLine();

				System.out.print("Enter Employee Name: ");
				name = sc.nextLine();

				System.out.print("Enter Employee Salary: ");
				salary = sc.nextDouble();

				sll.insertAtEnd(new Employee(id, name, salary));
				break;

			case 3:
				sll.deleteFromEnd();
				break;

			case 4:
				sll.deleteFromBeg();
				break;

			case 5:
				System.out.println("1. Sort By ID.");
				System.out.println("2. Sort By Name");
				System.out.println("3. Sort By Salary");
				System.out.println("Enter Choice: ");
				int sortChoice = sc.nextInt();

				if (sortChoice == 1) {
					sll.sortByID();
				} else if (sortChoice == 2) {
					sll.sortByName();
				} else if (sortChoice == 3) {
					sll.sortBySalary();
				} else {
					System.out.println("Invalid Choice!");
				}
				break;

			case 6:
				sll.display();
				break;

			case 0:
				System.out.println("----- Program Terminated -----");
				break;

			default:
				System.out.println("Invalid Choice!");

			}
		} while (choice != 0);
		sc.close();
	}
}
