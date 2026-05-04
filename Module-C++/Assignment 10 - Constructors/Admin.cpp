#include <iostream>
using namespace std;

struct Admin {
  int id;
  string name;
  double salary, allowance;

  Admin() {
    this->id = 0;
    this->name = "Not Given";
    this->salary = 00;
    this->allowance = 00;
  }

  Admin(int id, string name, double salary, double allowance) {
    this->id = id;
    this->name = name;
    this->salary = salary;
    this->allowance = allowance;
  }
  void setID(int id) { this->id = id; }
  void setName(string name) { this->name = name; }
  void setSalary(double salary) { this->salary = salary; }
  void setAllowancew(double al) { this->allowance = al; }
  int getID() { return this->id; }
  string getName() { return this->name; }
  double getSalary() { return this->salary; }
  double getAllowance() { return this->allowance; }
  void display() {
    cout << "\n-------- Student Details --------";
    cout << "\nID: " << id;
    cout << "\nName: " << name;
    cout << "\nSalary: " << salary;
    cout << "\nAllowance: " << allowance;
  }
};

int main() {
  Admin a1, a2;

  Admin a3;
  a3.display();

  Admin a4(123, "Divya", 30000, 1000);
  a4.display();
  
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