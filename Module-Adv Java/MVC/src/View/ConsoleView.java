package View;

import java.util.Scanner;

import Controller.CalculatorController;

public class ConsoleView {

	public static void showView() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		CalculatorController cc = new CalculatorController();
		int res=cc.add(n1,n2);
		System.out.println("Addition is: "+res);
	}
	
}
