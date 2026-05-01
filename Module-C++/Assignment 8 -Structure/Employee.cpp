#include<iostream>
using namespace std;

struct Employee{
    int id;
    string name;
    double salary;

    void storeEmployee(){
        cout<<"Enter ID: ";
        cin>>this->id;

        cin.ignore();
        
        cout<<"Enter Name: ";
        getline(cin,name);
        cout<<"Enter Salary: ";
        cin>>this->salary;
    }
    void display(){

        cout<<"ID: "<<this->id;
        cout<<"\nName: "<<this->name;
        cout<<"\nSalary: "<<this->salary;
    }
};
int main(){
    Employee e1;

    e1.storeEmployee();
    e1.display();

}