#include<iostream>
using namespace std;

struct Time{
    int hr,min,sec;

    void storeTime(){
        cout<<"Enter Hrs: ";
        cin>>this->hr;
        cout<<"Enter Mins: ";
        cin>>this->min;
        cout<<"Enter Sec: ";
        cin>>this->sec;
    }

    void display(){
        cout<<"\nHrs: "<<this->hr;
        cout<<"\nMins: "<<this->min;
        cout<<"Secs: "<<this->sec;
    }
};
int main(){
    Time t1,t2;

    t1.storeTime();
    t2.storeTime();

    t1.display();
    t2.display();

}