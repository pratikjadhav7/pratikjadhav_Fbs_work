#include <iostream>
#include <string.h>
using namespace std;

struct Student {
  int rollNo;
  double marks;
  string name;


  void storeStudent(){
    cout<<"Enter Roll Num:";
    cin>>rollNo;

    cin.ignore();
    
    cout<<"Enter Name:";
    getline(cin,name);
    cout<<"Enter Marks: ";
    cin>>marks;
  }
  void display() {
    cout << "Roll Num: " << rollNo;
    cout << "\nName: " << name;
    cout << "\nMarks: " <<marks;
  }
};
int main() {

  Student s1;
  s1.storeStudent();
  s1.display();
}