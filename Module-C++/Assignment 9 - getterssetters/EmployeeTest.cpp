#include<iostream>
using namespace std;

struct Employee{
    int id;
    double salary;
    string name;

    void setID(int a){
        this->id=a;
    }
    void setSalary(double salary){
        this->salary=salary;
    }
    void setName(string name){
        this->name=name;
    }
    int getID(){
        return this->id;
    }
    double getSalary(){
        return this->salary;
    }
    string getName(){
        return this->name;
    }

    void display(){
        cout<<"\n"<<"ID: "<<this->id;
        cout<<"\n"<<"Name: "<<this->name;
        cout<<"\n"<<"Salary: "<<this->salary;
    }
};

int main(){
    Employee e1,e2;

    e1.setID(101);
    e1.setName("Pratik");
    e1.setSalary(45000);
    e1.display();

    e2.setID(102);
    e2.setName("Chetan");
    e2.setSalary(55000);
    e2.display();
}