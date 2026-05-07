#include<iostream>
using namespace std;

struct Number{
  int x;

  Number(int n=0){
    this->x=n;
  }

   void operator++(){
    ++x;
  }

  void display(){
    cout<<x;
  }
};
int main(){
    Number n(9);
    ++n;
    n.display();
}