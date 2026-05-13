#include<iostream>
using namespace std;

struct Employee {
    int id;
    string name;
    double salary;

    Employee() {
        this->id = 0;
        this->name = "Not Given";
        this->salary = 0;
    }

    Employee(int id, string name, double salary) {
        this->id = id;
        this->name = name;
        this->salary = salary;
    }

   virtual void display() {
        cout << "ID: " << this->id << endl;
        cout << "Name: " << this->name << endl;
        cout << "Salary: " << this->salary << endl;
    }
};

struct Admin : public Employee {
    double allowance;

    Admin() : Employee() {
        this->allowance = 0;
    }

    Admin(double allowance, int id, string name, double salary)
        : Employee(id, name, salary) {
        this->allowance = allowance;
    }

    void display() {
        Employee::display();
        cout << "Allowance: " << allowance << endl;
    }
};

struct SalesManager : public Employee {
    double incentive, target;

    SalesManager() : Employee() {
        this->incentive = 0;
        this->target = 0;
    }

    SalesManager(double incentive, double target,
                 int id, string name, double salary)
        : Employee(id, name, salary) {

        this->incentive = incentive;
        this->target = target;
    }

    void display() {
        Employee::display();
        cout << "Incentive: " << incentive << endl;
        cout << "Target: " << target << endl;
    }
};

struct HR : public Employee {
    double commission;

    HR() : Employee() {
        this->commission = 0;
    }

    HR(double commission, int id, string name, double salary)
        : Employee(id, name, salary) {

        this->commission = commission;
    }

    void display() {
        Employee::display();
        cout << "Commission: " << commission << endl;
    }
};

int main() {

    Employee*ep;
    Employee e1(101, "Pratik", 40000);
    ep=&e1;
    ep->display();

    cout << endl;

    Admin a1(12000, 102, "Snehal", 45000);
    ep=&a1;
    ep->display();

    cout << endl;

    SalesManager sm(1000, 10, 103, "Chetan", 35000);
    ep=&sm;
    ep->display();

    cout << endl;

    HR h1(5000, 104, "Rohit", 30000);
    ep=&h1;
    ep->display();

    return 0;
}