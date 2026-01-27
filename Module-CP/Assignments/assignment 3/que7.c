#include<stdio.h>
int main(){
    int fact=1,n = 5;
    while(n>0){
        fact = fact*n;
        n--;
    }
    printf("%d",fact);
}