#include<iostream>
using namespace std;

struct BankAccount{
    int accNumber;
    string holderName;
    double currentBalance;
    double intrestRate;
    
    BankAccount(){
       this->accNumber=00;
       this->holderName="Not Given";
       this->currentBalance=00;
       this->intrestRate=00;
    }

    BankAccount(int accNum,string holderName,double currentBalance,double intrestRate){
        this->accNumber=accNum;
        this->holderName=holderName;
        this->currentBalance=currentBalance;
        this->intrestRate=intrestRate;
    }

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
        cout<<"\nACC Number: "<<this->accNumber;
        cout<<"\nHolder Name: "<<this->holderName;
        cout<<"\nCurrent Balance: "<<this->currentBalance;
        cout<<"\nIntrest Rate: "<<this->intrestRate;
    }
};

int main(){
    BankAccount b1,b2;

    BankAccount b3;
    b3.display();

    BankAccount b4(242132,"Mahesh",4000,100);
    b4.display();

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