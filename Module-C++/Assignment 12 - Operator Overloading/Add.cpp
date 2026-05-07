#include<iostream>
using namespace std;

struct Number{
    int n;

    Number(int n=0){
        this->n=n;
    }

    Number operator+(Number n){
        Number temp;

        temp.n=this->n+n.n;

        return temp;
    }

    void display(){
        cout<<n;
    }


};
int main(){
    Number n1(3),n2(6);

    Number n3=n1+n2;

    n3.display();
}