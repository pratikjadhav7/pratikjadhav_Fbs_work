#include<iostream>
using namespace std;
struct Complex{
    double real,imag;

    void storeNum(){
        cout<<"\nEnter Real Part: ";
        cin>>this->real;
        cout<<"\nEnter Imaginery Part: ";
        cin>>this->imag;
    }

    void display(){
        cout<<this->real<<" + "<<this->imag<<"i";
    }
};
int main(){
    Complex c1,c2;

    c1.storeNum();
    c1.display();

    c2.storeNum();
    c2.display();

}