package Controller;

import Service.CalculatorService;

public class CalculatorController {

	public int add(int n1, int n2) {
		CalculatorService cs =new CalculatorService();
		int res=cs.add(n1,n2);
		return res;
	}

}
