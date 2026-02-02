#include<stdio.h>
void isLeapYear(int*year);
int main(){
int year = 2004;
isLeapYear(&year);
}
void isLeapYear(int *year){
        
    if(*year%4==0 && *year%100!=0||*year%400==0){
        printf("%d is leap year",*year);
    }else{
        printf("%d is not leap year",*year);
    }
}