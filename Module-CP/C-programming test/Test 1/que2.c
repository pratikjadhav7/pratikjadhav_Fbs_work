#include<stdio.h>
int main(){
    int num;
    printf("Enter the Number:");
    scanf("%d",&num);
    int ld = num%100;
    printf("Last two digitS are:%d",ld);
}