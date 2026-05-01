#include <iostream>
using namespace std;

struct SalesManager {
  int id;
  string name;
  double salary,target,incentive;

  void storeSalesManager() {
    cout << "Enter ID: ";
    cin >> id;

    cin.ignore();

    cout << "Enter Name: ";
    getline(cin, name);

    cout << "Enter Salary: ";
    cin >> salary;

    cout << "Enter Incentive: ";
    cin >> incentive;
    
    cout << "Enter Target: ";
    cin >> target;
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

    s1.storeSalesManager();
    s1.display();
    s2.storeSalesManager();
    s2.display();
}