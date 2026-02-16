#include<stdio.h>
int main(){
    int n=145;
    int sum=0;
    int temp,digit;
    temp=n;
    while(temp>0){
        digit=temp%10;
        int fact=1;
        for(int i=1;i<=digit;i++){
            fact*=i;
        }
        sum+=fact;
        temp/=10;
    }
    if(sum==n)
    printf("Strong");
    else
    printf("Not Strong");
}