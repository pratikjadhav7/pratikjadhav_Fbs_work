#include<stdio.h>
void isEvenOdd(int);
int main(){
   int n=11;
   isEvenOdd(n);
   return 0;
}
void isEvenOdd(int num){
    if(num%2==0)
        printf("Number is Even.");
    else
        printf("Number is Odd.");
    
}