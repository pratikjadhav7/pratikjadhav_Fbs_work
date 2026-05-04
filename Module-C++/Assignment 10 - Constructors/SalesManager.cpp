#include <iostream>
using namespace std;

struct SalesManager {
  int id;
  string name;
  double salary,target,incentive;

  SalesManager(){
    this->id=0;
    this->name="Not Given";
    this->salary=00;
    this->target=00;
    this->incentive=00;
  }

  SalesManager(int id,string name,double salary,double target,double incentive){
    this->id=id;
    this->name=name;
    this->salary=salary;
    this->target=target;
    this->incentive=incentive;
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
  void setTarget(double target){
    this->target=target;
  }
  void setIncentive(double incentive){
    this->incentive=incentive;
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
  double getTarget(){
    return this->target;
  }
  double getIncentive(){
    return this->incentive;
  }
  void display() {
    cout<<"\n------ SalesManager Details -------";
    cout << "\nID: " << id;
    cout << "\nName: " << name;
    cout << "\nSalary: " << salary;
    cout << "\nTarget: " << target;
    cout << "Incentive: " << incentive;
  }
};
int main() {
    SalesManager s1,s2;

    SalesManager s3;
    s3.display();

    SalesManager s4(123,"Pratik",40000,1000,1500);
    s4.display();

    s1.setID(101);
    s1.setName("Mahesh");
    s1.setSalary(30000);
    s1.setIncentive(2000);
    s1.setTarget(1000);
    s1.display();

    s2.setID(102);
    s2.setName("Chetan");
    s2.setSalary(35000);
    s2.setIncentive(2000);
    s2.setTarget(1000);
    s2.display();
}