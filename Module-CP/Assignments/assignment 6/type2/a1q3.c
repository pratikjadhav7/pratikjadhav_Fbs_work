#include<stdio.h>
int isLeapYear();
int main(){

int res =isLeapYear();
if(res==1)
printf("Year is leap year");
else
 printf("Year is leap year");
}
int isLeapYear(){
    int year = 2004;
    if(year%4==0 && year%100!=0||year%400==0)
        return 1;
    else
        return 0;
    
}