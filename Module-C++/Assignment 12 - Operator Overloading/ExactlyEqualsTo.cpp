#include<iostream>
using namespace std;

struct Student{
    int marks;

    Student(int m=0){
        this->marks=m;
    }
    bool operator==(Student s){
         if(marks==s.marks){
            return true;
         }else{
            return false;
         }
    }
};
int main(){
    Student s1(40),s2(40);

    if(s1==s2){
        cout<<"Equal";
    }else{
        cout<<"Not Equal";
    }
}