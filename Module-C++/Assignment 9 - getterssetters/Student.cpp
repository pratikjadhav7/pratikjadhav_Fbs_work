#include <iostream>
using namespace std;

struct Student {
  int frn;
  string studentName;
  double distanceCovered;

  void setFrn(int frn) { this->frn = frn; }
  void setName(string name) { this->studentName = name; }
  void setDistanceCovered(double dis) { this->distanceCovered = dis; }
  int getFrn() { return this->frn; }
  string getName() { return this->studentName; }
  double getDistanceCovered() { return this->distanceCovered; }

  void display() {
    cout << "\nFRN: " << this->frn;
    cout << "\nStudent Name: " << this->studentName;
    cout << "Distance Covered: " << this->distanceCovered;
  }
};
 int main() {

  Student s1, s2;
  s1.setFrn(5);
  s1.setName("Pratik");
  s1.setDistanceCovered(4);
  s1.display();
  s2.setFrn(10);
  s2.setName("Chetan");
  s2.setDistanceCovered(7.5);
  s2.display();
}