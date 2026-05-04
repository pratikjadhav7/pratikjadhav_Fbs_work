#include <iostream>
using namespace std;

struct Admin {
  int id;
  string name;
  double salary, allowance;

 void setID(int id){
      this->id=id;
  }
  void setName(string name){
    this->name=name;
  }
  void setSalary(double salary){
    this->salary=salary;
  }
  void setAllowancew(double al){
    this->allowance=al;
  }
  int getID(){
     return  this->id;
  }
  string getName(){
    return this->name;
  }
  double getSalary(){
    return this->salary;
  }
  double getAllowance(){
    return this->allowance;
  }
  void display() {
    cout << "-------- Student Details --------";
    cout << "ID: " << id;
    cout << "\nName: " << name;
    cout << "\nSalary: " << salary;
    cout << "\nAllowance: " << allowance;
  }
};

int main() {
  Admin a1, a2;

  a1.setID(123);
  a1.setName("Pratik");
  a1.setSalary(30000);
  a1.setAllowancew(1231);
  a1.display();
  
  a2.setID(101);
  a2.setName("chetan");
  a2.setSalary(30000);
  a2.setAllowancew(1231);
  a2.display();
}