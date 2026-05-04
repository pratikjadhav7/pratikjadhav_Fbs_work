
import java.util.*;

abstract class InsurancePolicy {

    String policyHolderName;
    double basePremium;

    public InsurancePolicy(String policyHolderName, double basePremium) {
        this.policyHolderName = policyHolderName;
        this.basePremium = basePremium;
    }

    void printPolicyDetails() {
        System.out.println("PolicyHolder Name: " + this.policyHolderName);
        System.out.println("Base Premium: " + this.basePremium);
        System.out.println("Final Premium: " + calculatePremium());
    }

    abstract double calculatePremium();
}

class CarInsurance extends InsurancePolicy {

    int carAgeInYear;
    boolean hadAccidentInLastYear;
    double carValue;

    public CarInsurance(String policyHolderName, double basePremium, int carAgeInYear, boolean hadAccidentInLastYear, double carValue) {
        super(policyHolderName, basePremium);
        this.carAgeInYear = carAgeInYear;
        this.hadAccidentInLastYear = hadAccidentInLastYear;
        this.carValue = carValue;
    }

    double calculatePremium() {

        double premium=basePremium;

        if (carAgeInYear <= 3) {
            premium += premium * 0.10;
        } else if (carAgeInYear >= 4 && carAgeInYear <= 7) {
            premium += premium * 0.20;
        } else if (carAgeInYear > 7) {
            premium += premium * 0.30;
        }

        if (hadAccidentInLastYear) {
            premium += premium * 0.25;
        } else {
            premium -= premium * 0.10;
        }

        if (carValue > 1000000) {
            premium += 2000;
        }
        return premium;
    }

}

class HealthInsurance extends InsurancePolicy {

    int age;
    boolean isSmoker, hasPreExistingDisease;

    public HealthInsurance(int age, boolean isSmoker, boolean hasPreExistingDisease, String policyHolderName, double basePremium) {
        super(policyHolderName, basePremium);
        this.age = age;
        this.isSmoker = isSmoker;
        this.hasPreExistingDisease = hasPreExistingDisease;
    }

    double calculatePremium() {
        double premium=basePremium;

        if (age < 30) {
            premium += premium * 0.10;
        } else if (age >= 30 && age <= 45) {
            premium += premium * 0.25;
        } else if (age > 45) {
            premium += premium * 0.40;
        }

        if (isSmoker) {
            premium += premium * 0.30;
        } else {
            premium -= premium * 0.05;
        }

        if (hasPreExistingDisease) {
            premium += premium * 0.20;
        }

        return premium;
    }
}

public class InsurancePremiumCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        InsurancePolicy ip;

        int choice;

        do {
            System.out.println("Choose Policiy Type:");

            System.out.println("1. Car Insurance");
            System.out.println("2. Health Insurance");
            System.out.println("0. Exit");

            System.out.println("---------Enter Choice:------");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ip = new CarInsurance("Pratik", 10000, 3, true, 800000);
                    ip.printPolicyDetails();
                    break;

                case 2:
                    ip = new HealthInsurance(30, true, false, "Mahesh", 15000);
                    ip.printPolicyDetails();
                    break;

                case 0:
                    System.out.println("Exited!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 0);

    }
}
