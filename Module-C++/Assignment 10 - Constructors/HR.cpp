#include <iostream>
using namespace std;

struct HR {
  int id;
  string name;
  double salary, commission;

  HR(){
    this->id=0;
    this->name="Not Given";
    this->salary=00;
    this->commission=00;
  }

  HR(int id,string name,double salary,double commision){
    this->id=id;
    this->name=name;
    this->salary=salary;
    this->commission=commision;
  }
  void setID(int id){
      this->id=id;
  }
  void setName(string name){
    this->name=name;
  }
  void setSalary(double salary){
    this->salary=salary;
  }
  void setCommission(double commission){
    this->commission=commission;
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
  double getCommission(){
    return this->commission;
  }
  void display() {
    cout<<"\n------ HR Details -------";
    cout << "\nID: " << id;
    cout << "\nName: " << name;
    cout << "\nSalary: " << salary;
    cout << "Commision: " << commission;
  }
};
int main() {
    HR h1,h2;

    HR h3;
    h3.display();

    HR h4(123,"Pratik",12000,500);
    h4.display();
    
    h1.setID(101);
    h1.setName("Snehal");
    h1.setSalary(50000);
    h1.setCommission(1234);
    h1.display();
   
    h2.setID(102);
    h2.setName("Chetan");
    h2.setSalary(5000);
    h2.setCommission(134);
    h2.display();
}