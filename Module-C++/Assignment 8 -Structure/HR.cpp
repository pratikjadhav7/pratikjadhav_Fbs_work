#include <iostream>
using namespace std;

struct HR {
  int id;
  string name;
  double salary, commission;

  void storeHR() {
    cout << "Enter ID: ";
    cin >> id;

    cin.ignore();

    cout << "Enter Name: ";
    getline(cin, name);

    cout << "Enter Salary: ";
    cin >> salary;

    cout << "Enter Commission: ";
    cin >> commission;
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

    h1.storeHR();
    h1.display();
    h2.storeHR();
    h2.display();
}