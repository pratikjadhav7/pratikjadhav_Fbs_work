#include<stdio.h>
int isLeapYear(int);
int main(){
int year = 2004;
int res=isLeapYear(year);
if(res==1)
printf(" is leap year");
else
 printf("is not leap year");
}
int isLeapYear(int year){
        
    if(year%4==0 && year%100!=0||year%400==0){
        return 0;
    }else{
        return 0;
    }
}