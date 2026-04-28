#include<iostream>
using namespace std ;

int main(){
    float basicSalary;
    float da,ta,hra;

    cout<<"Enter Salary: ";
    cin>>basicSalary;

    if(basicSalary<=5000){
        da=0.1*basicSalary;
        ta=0.2*basicSalary;
        hra=0.25*basicSalary;
    }else{
         da=0.15*basicSalary;
        ta=0.25*basicSalary;
        hra=0.30*basicSalary;
    }

    float totalSalary=basicSalary+da+ta+hra;
    cout<<"Total Salary"<<totalSalary;
}