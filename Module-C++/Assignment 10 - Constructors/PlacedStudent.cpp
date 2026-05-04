#include <iostream>
using namespace std;

struct Student {
  int frn;
  string studentName, companyName, designation;
  double distanceCovered;

  Student(){
    this->frn=0;
    this->studentName="Not Given";
    this->companyName="Not Given";
    this->designation="Not Given";
    this->distanceCovered=00;
  }

  Student(int frn,string name,string cName,string designation,double dis){
    this->frn=frn;
    this->studentName=name;
    this->companyName=cName;
    this->designation=designation;
    this->distanceCovered=dis;
  }
  void setFrn(int frn) { 
    this->frn = frn; 
   }
  void setName(string name) { 
    this->studentName = name; 
   }
  void setDistanceCovered(double dis) { 
    this->distanceCovered = dis; 
   }
  void setCompanyName(string cName) { 
    this->companyName = cName;
   }
  void setDesignation(string designamtion) { 
    this->designation = designamtion; 
   }
  int getFrn() { 
    return this->frn; 
   }
  string getName() { 
    return this->studentName; 
   }
  double getDistanceCovered() { 
     return this->distanceCovered; 
    }
  string getCompanyName() { 
    return this->companyName; 
   }
  string getDesignation() { 
    return this->designation; 
    }

  void display() {
    cout << "\nFRN: " << this->frn;
    cout << "\nStudent Name: " << this->studentName;
    cout << "\nDistance Covered: " << this->distanceCovered;
    cout << "\nCompany Name: " << this->companyName;
    cout << "\nDesignamtion: " << this->designation;
  }
};
int main() {

  Student s1, s2;

  Student s3;
  s3.display();

  Student s4(18,"Snehal","Infosys","lmn",4);
  s4.display();

  s1.setFrn(5);
  s1.setName("Pratik");
  s1.setDistanceCovered(4);
  s1.setCompanyName("Wipro");
  s1.setDesignation("xyz");

  s1.display();

  s2.setFrn(10);
  s2.setName("Chetan");
  s2.setDistanceCovered(7.5);
  s2.setCompanyName("TCS");
  s2.setDesignation("abc");

  s2.display();
}