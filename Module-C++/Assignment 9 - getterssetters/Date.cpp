#include<iostream>
#include<string.h>
using namespace std;

struct Date{
    int day,month,year;
    string dow;

    void setDay(int a){
        this->day=a;
    }
    void setMonth(int b){
        this->month=b;
    }
    void setYear(int c){
        this->year=c;
    }
    void setDow(string d){
        this->dow=d;
    }
    int getDay(){
       return this->day;
    }
    int getMonth(){
       return this->month;
    }
    int getYear(){
       return this->year;
    }
    string getDow(){
       return this->dow;
    }

    void display(){
        cout<<"\nDay: "<<this->day;
        cout<<"\nMonth: "<<this->month;
        cout<<"\nYear: "<<this->year;
        cout<<"\nDOW: "<<this->dow;
    }
};
int main(){

    Date d1,d2;

    d1.setDay(2);
    d1.setMonth(4);
    d1.setYear(2025);
    d1.setDow("Monday");

    d1.display();
}