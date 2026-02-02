#include<stdio.h>
void isEvenOdd();
int main(){
   isEvenOdd();
}
void isEvenOdd(){
     int num = 11;
    if(num%2==0){
        printf("Number is Even.");
    }else{
        printf("Number is Odd.");
    }
}