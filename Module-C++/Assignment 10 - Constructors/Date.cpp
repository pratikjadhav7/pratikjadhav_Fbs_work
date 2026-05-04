#include<iostream>
#include<string.h>
using namespace std;

struct Date{
    int day,month,year;
    string dow;

    Date(){
        this->day=0;
        this->month=0;
        this->year=0;
        this->dow="Not Given";
    }

    Date(int day,int mon,int yr,string dow){
        this->day=day;
        this->month=mon;
        this->year=yr;
        this->dow=dow;
    }
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

    d2.display();

    Date d3(2,3,2004,"Tuesday");
    d3.display();

    d1.setDay(2);
    d1.setMonth(4);
    d1.setYear(2025);
    d1.setDow("Monday");

    d1.display();
}