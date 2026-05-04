
import java.util.*;

abstract class ElectricityBill {

    String customerName;
    int units;

    public ElectricityBill(String customerName, int units) {
        this.customerName = customerName;
        this.units = units;
    }

    void showUsage() {
        System.out.println("Customer Name: " + this.customerName);
        System.out.println("Units Consumed: " + this.units);
    }

    final void generateBill() {
        showUsage();

        double bill = calculateBill();

        double tax = bill * 0.05;

        double finalBill = bill + tax + 50;

        System.out.println("Final Bill Amount: " + finalBill);

    }

    abstract double calculateBill();
}

class ResidentialBill extends ElectricityBill {

    public ResidentialBill(String customerName, int units) {
        super(customerName, units);
    }

    @Override
    double calculateBill() {
        double bill = 0;

        if (units > 0 && units <= 100) {
            bill = units * 2.5;
        } else if (units >= 101 && units <= 300) {
            bill = (100 * 2.5) + ((units - 100) * 3.5);
        } else {
            bill = (100 * 2.5) + (200 * 3.5) + ((units - 300) * 5);
        }

        if (units > 500) {
            bill += 150;
        }
        return bill;
    }

}

class CommercialBill extends ElectricityBill {

    double bill = units * 6.5;

    public CommercialBill(String customerName, int units) {
        super(customerName, units);
    }

    double calculateBill() {
        if (units < 200 && bill < 1500) {
            bill = 1500;
        }

        if (units > 1000) {
            bill += bill * 0.08;
        }
        return bill;
    }

}

public class ElectricityBillCalculator {

    public static void main(String[] args) {

        ElectricityBill eb;
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
System.out.println("=========================================");
            System.out.println("1. Residential");
            System.out.println("2. Commercial");
            System.out.println("0. Exit");

            System.out.println("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    eb = new ResidentialBill("Pratik", 120);
                    eb.generateBill();
                    break;
                case 2:
                    eb = new CommercialBill("Snehal", 1200);
                    eb.generateBill();
                    break;
                case 0:
                    System.out.println("Exited!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }while(choice!=0);
    }
    
        
}
