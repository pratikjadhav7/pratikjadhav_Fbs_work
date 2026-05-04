#include<iostream>
using namespace std;

struct BankAccount{
    int accNumber;
    string holderName;
    double currentBalance;
    double intrestRate;
    
    void setAccNumber(int acNum){
        this->accNumber=acNum;
    }
    void setHolderName(string name){
        this->holderName=name;
    }
    void setCurrentBalance(double balance){
        this->currentBalance=balance;
    }
    void setIntrestRate(double intrest){
        this->intrestRate=intrest;
    }
    int getAccNumber(){
        return this->accNumber;
    }
    string getHolderName(){
        return this->holderName;
    }
    double getCurrentBalance(){
        return this->currentBalance;
    }
    double getIntrestRate(){
        return this->intrestRate;
    }
    void display(){
        cout<<"ACC Number: "<<this->accNumber;
        cout<<"Holder Name: "<<this->holderName;
        cout<<"Current Balance: "<<this->currentBalance;
        cout<<"Intrest Rate: "<<this->intrestRate;
    }
};

int main(){
    BankAccount b1,b2;

    b1.setAccNumber(123456);
    b1.setHolderName("Vandana");
    b1.setCurrentBalance(9000000);
    b1.setIntrestRate(2345);
    b1.display();

    b2.setAccNumber(90876);
    b2.setHolderName("Pratik");
    b2.setCurrentBalance(900);
    b2.setIntrestRate(123);
    b2.display();


}