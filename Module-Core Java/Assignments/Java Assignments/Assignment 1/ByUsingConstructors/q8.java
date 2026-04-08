
class BankAccount {

    int accountNumber;
    String holderName;
    double currentBalance;
    double intrestRate;

    BankAccount() {
        this.accountNumber = 454;
        this.holderName = "Divya";
        this.currentBalance = 324565;
        this.intrestRate = 123;
    }

    BankAccount(int accountNumber, String holderName, double currentBalance, double intrestRate) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.currentBalance = currentBalance;
        this.intrestRate = intrestRate;
    }

    void setAccountNo(int acNum) {
        this.accountNumber = acNum;
    }

    void setHolderName(String name) {
        this.holderName = name;
    }

    void setCurrentBal(double balance) {
        this.currentBalance = balance;
    }

    void setIntrestRate(double rate) {
        this.intrestRate = rate;
    }

    int getAccountNo() {
        return this.accountNumber;
    }

    String getHolderName() {
        return this.holderName;
    }

    double getCurrentBal() {
        return this.currentBalance;
    }

    double getIntrestRate() {
        return this.intrestRate;
    }

    void display() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Holder Name: " + this.holderName);
        System.out.println("Current Balance: " + this.currentBalance);
        System.out.println("intrest Rate: " + this.intrestRate);
    }
}

public class q8 {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();
        BankAccount b3 = new BankAccount();
        BankAccount b4 = new BankAccount(808,"Snehal",98076,405);

        b1.setAccountNo(33552);
        b1.setHolderName("Pratik");
        b1.setCurrentBal(243.78);
        b1.setIntrestRate(74);
        b2.setAccountNo(33552);
        b2.setHolderName("Chetan");
        b2.setCurrentBal(98324.78);
        b2.setIntrestRate(60);

        b1.display();
        b2.display();
        b3.display();
        b4.display();
    }
}
