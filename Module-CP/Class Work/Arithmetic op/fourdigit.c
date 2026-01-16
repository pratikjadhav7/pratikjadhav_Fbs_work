#include<stdio.h>
int main(){
    int num=1234;
    int n1,n2,n3,n4,q1,q2,sum;
    n1=num%10;
    printf("%d",n1);
    q1=num/10;
   // printf("%d",q1);
    n2=q1%10;
    printf("%d",n2);
    q2=q1/10;
   // printf("%d",q2);
    n3=q2%10;
    printf("%d",n3);
    n4=q2/10;
    printf("%d",n4);
    sum = n1+n2+n3+n4;
    printf("Addition will be %d",sum);
}