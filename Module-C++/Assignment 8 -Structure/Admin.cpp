#include <iostream>
using namespace std;

struct Admin {
  int id;
  string name;
  double salary, allowance;

  void storeAdmin() {
    cout << "Enter ID: ";
    cin >> id;

    cin.ignore();

    cout << "Enter Name: ";
    getline(cin, name);

    cout << "Enter Salary: ";
    cin >> salary;

    cout << "Allowance: ";
    cin >> allowance;
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

  a1.storeAdmin();
  a1.display();
  a2.storeAdmin();
  a2.display();
}