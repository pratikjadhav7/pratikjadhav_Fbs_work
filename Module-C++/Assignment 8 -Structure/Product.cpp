#include<iostream>
using namespace std;

struct Product{
    int id;
    string name;
    double quantity,price;

    void storeProduct (){
       cout<<"Enter ID: ";
       cin>>this->id;
       cin.ignore();

       cout<<"Enter Name: ";
       getline(cin,name);

       cout<<"Enter Quantity: ";
       cin>>this->quantity;

       cout<<"Enter Price: ";
       cin>>this->price;
    }

    void display(){
        cout<<"Product ID: "<<this->id;
        cout<<"Product Name: "<<this->name;
        cout<<"Product Quantity: "<<this->quantity;
        cout<<"Product Price: "<<this->price;
    }
};
int main(){
 
    Product p1,p2;

    p1.storeProduct();
    p1.display();

    p2.storeProduct();
    p2.display();
}