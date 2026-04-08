class BankAccount{
    int accountNumber;
    String holderName;
    double currentBalance;
    double intrestRate;

     BankAccount() {
      this.accountNumber=454;
      this.holderName="Pratik";
      this.currentBalance=324565;
      this.intrestRate=123;
    }

     BankAccount(int accountNumber, String holderName, double currentBalance, double intrestRate) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.currentBalance = currentBalance;
        this.intrestRate = intrestRate;
    }

    void display(){
        System.out.println("Account Number: "+this.accountNumber);
        System.out.println("Holder Name: "+this.holderName);
        System.out.println("Current Balance: "+this.currentBalance);
        System.out.println("intrest Rate: "+this.intrestRate);
    }
}
public class q8{
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        BankAccount b2=new BankAccount(808,"Sneha",98076,405);

        b1.display();
        b2.display();
    }
}