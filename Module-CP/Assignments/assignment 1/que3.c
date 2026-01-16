#include<stdio.h>
int main(){
    int year = 2004;
    if(year%4==0){
        printf("%d is leap year",year);
    }else{
        printf("%d is not leap year",year);
    }
}