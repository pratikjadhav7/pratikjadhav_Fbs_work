#include<stdio.h>
int isEvenOdd(int);
int main(){
   int n=11;
   int res=isEvenOdd(n);
   if (res==1)
   printf("Number is Even.");
   else
     printf("Number is Odd.");;
}
int isEvenOdd(int num){
    if(num%2==0)
        return 1;
    else
       return 0;
    
}