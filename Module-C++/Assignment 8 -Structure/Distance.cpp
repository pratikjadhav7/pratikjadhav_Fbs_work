#include<iostream>
using namespace std;

struct Distance{
    double feet,inch;

    void storeDistance(){
        cout<<"Enter in feet: ";
        cin>>this->feet;
        cout<<"Enter in Inch: ";
        cin>>this->inch;
    }

    void display(){
        cout<<"feet: "<<this->feet;
        cout<<"inch: "<<this->inch;
    }
};
int main(){

    Distance d1,d2;

    d1.storeDistance();
    d1.display();

    d2.storeDistance();
    d2.display();
}