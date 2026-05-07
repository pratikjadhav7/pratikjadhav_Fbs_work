#include<iostream>
using namespace std;

struct Complex{
    int real,imag;

   Complex(int r=0,int i=0){
     this->real=r;
     this->imag=i;
   }

   Complex operator+(Complex c){
    Complex temp;

    temp.real=this->real+c.real;
    temp.imag=this->imag+c.imag;

    return temp;
   }

   void display(){
    cout<<real<<" + "<<imag<<"i";
   }
};
int main(){
  Complex c1(2,3);
  Complex c2(5,6);

  Complex c3 = c1+c2;

  c3.display();
}