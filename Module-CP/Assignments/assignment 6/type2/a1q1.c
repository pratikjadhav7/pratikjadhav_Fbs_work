#include<stdio.h>
int isEvenOdd();
int main(){
   int res=isEvenOdd();
   if(res==1)
   printf("Even");
   else
    printf("Odd");
}
int isEvenOdd(){
     int num = 11;
    if(num%2==0)
        return 1;
    else
        return 0;
    
}