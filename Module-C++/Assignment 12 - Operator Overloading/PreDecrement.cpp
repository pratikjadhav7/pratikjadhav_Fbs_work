#include<iostream>
using namespace std;

struct Number{
    int n;

    Number(int n=0){
        this->n=n;
    }

    void operator--(){
        --n;
    }
    void display(){
        cout<<n;
    }

};

int main(){
    Number n(5);
    --n;

    n.display();
}