
abstract class Payment {

    int paymentID;
    double amount;
    String payerName;
    String status;

    public Payment(int paymentID, double amount, String payerName, String status) {
        this.paymentID = paymentID;
        this.amount = amount;
        this.payerName = payerName;
        this.status = status;
    }

    void printSummary() {
        System.out.println("Payment ID: " + this.paymentID);
        System.out.println("Ammount: " + this.amount);
        System.out.println("Payer Name: " + this.payerName);
        System.out.println("Status: " + this.status);
    }

    final void process() {

        if (validate()) {

            deductAmount();
            sendNotification();
            status = "Success";

            System.out.println("Payment Successful!");
        } else {
            status = "Faild";

            System.out.println("Payment Faild!");
        }
    }

    abstract boolean validate();

    abstract void deductAmount();

    abstract void sendNotification();
}

class CardPayment extends Payment {

    long cardNumber; 
    int cvv;

    public CardPayment(long cardNumber,int cvv, int paymentID, double amount, String payerName, String status) {
        super(paymentID, amount, payerName, status);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    boolean validate() {
        if (cardNumber == 16 && cvv == 3 && amount > 0) {
            return true;
        }
        return false;
    }

    void deductAmount(){
        System.out.println("Amount: "+amount+" deducted using Card!");
    }

    void sendNotification(){
        System.out.println("Notification sent.Check it Out!");
    }
}

class UPIPayment extends Payment{
     String upiID;

    public UPIPayment(String upiID, int paymentID, double amount, String payerName, String status) {
        super(paymentID, amount, payerName, status);
        this.upiID = upiID;
    }

    boolean validate(){
        if(upiID.contains("@")  && amount>1&& amount<100000){
            return true;
        }
        return false;
    }

    void deductAmount(){
        System.out.println("Amount: "+amount+" deducted through UPI Payment!");
    }

      void sendNotification(){
        System.out.println("Notification sent.Check it Out!");
    }

     
}
public class OnlinePaymentSystem {

    public static void main(String[] args) {
        Payment p1,p2,p3,p4;

        p1 = new CardPayment(902345634356612L,555,123,10000,"Partik","Not Given");
        p2 = new CardPayment(123455678,555,123,50000,"Chetan","Not Given");
        p3 =  new UPIPayment("snehal@dfrg", 12345, 45000,"Snehal","Not Given");
        p4 =  new UPIPayment("maheshdfrg", 000345, 55000,"Mahesh","Not Given");

        p1.process();
        p1.printSummary();

        System.out.println("");
        
        p2.process();
        p2.printSummary();
        System.out.println("");
        
        p3.process();
        p3.printSummary();

        System.out.println("");
        
        p4.process();
        p4.printSummary();

    }
}
