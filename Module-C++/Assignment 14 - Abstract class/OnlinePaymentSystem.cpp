#include <iostream>
#include <string>
using namespace std;
class Payment {
public:
  int paymentID;
  double amount;
  string payerName;
  string status;

  Payment(int id, double amount, string payerName, string status) {
    this->paymentID = id;
    this->amount = amount;
    this->payerName = payerName;
    this->status = status;
  }
  void printSummary() {
    cout << "\nPayment ID: " << this->paymentID;
    cout << "\nAmount: " << this->amount;
    cout << "\nPayer Name: " << this->payerName;
    cout << "\nStatus: " << this->status;
  }

  virtual void process() final {
    if (validate()) {
      deductAmount();
      sendNotification();

      status = "Success";

      cout << "\nPayment Successful!";
    } else {
      cout << "\nPayment Faild!";
    }
  }

  virtual bool validate()=0;
  virtual void deductAmount()=0;
  virtual void sendNotification()=0;
};

class CardPayment : public Payment {
  long long cardNumber;
  int cvv;

  public:

  CardPayment(int id, double amount, string payerName, string status,
              long long cardNumber, int cvv)
      : Payment(id, amount, payerName, status) {
    this->cardNumber = cardNumber;
    this->cvv = cvv;
  }

  bool validate() {
    if (cardNumber == 16 && cvv == 3 && amount < 0) {
      return true;
    }
    return false;
  }

  void deductAmount() {
    cout << "\nAmount " << amount << " is deducted through Card!";
  }

  void sendNotification() { cout << "\nNotification sent.Check it Out!"; }
};

class UPIPayment : public Payment {
  string upiID;

  public:

  UPIPayment(int id, double amount, string payerName, string status,
             string upiID)
      : Payment(id, amount, payerName, status) {
    this->upiID = upiID;
  }

  bool validate() {
    if (upiID.find('@') != string::npos && amount<100000 && amount>1) {
      return true;
    }
    return false;
  }

  void deductAmount() {
    cout << "\nAmount " << amount << " is deducted through UPI Payment!";
  }

  void sendNotification() { cout << "\nNotification sent.Check it Out!"; }
};

int main(){
   Payment*py;
   
   CardPayment c1(101,40000,"Pratik","Success",12347899876543,123);
   py=&c1;

    py->process();
   py->printSummary();

   cout << "\n-------------------\n";
   
   UPIPayment p1(102,50000,"Snehal","Success","snehal@rgbgt");
   py=&p1;

   py->process();
   py->printSummary();

}