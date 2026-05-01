#include<iostream>
using namespace std;

struct Date{
    int date,month,year;

    void storeDate(){
        cout<<"Enter DAte: ";
        cin>>this->date;
        cout<<"Enter Month: ";
        cin>>this->month;
        cout<<"Enter Year: ";
        cin>>this->year;
    }
    
    void display(){
        cout<<"\nDate: "<<this->date;
        cout<<"\nMonth: "<<this->month;
        cout<<"Year: "<<this->year;
    }
};
int main(){
    Date d1,d2;

    d1.storeDate();
    d1.display();
    d2.storeDate();
    d2.display();

}