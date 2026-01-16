#include<stdio.h>
int main(){
    int num=123;
    int r1,r2,r3,q1,sum;
    r1=num%10;
    printf("%d",r1);
   r2=num/10;
   q1=r2%10;
   printf("%d",q1);
   r3=r2/10;
   printf("%d",r3);
   sum=r1+q1+r3;
   printf("Addition is: %d",sum);

}