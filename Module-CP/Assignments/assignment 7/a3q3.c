#include<stdio.h>
void sum(int*,int*);
int main(){
    int s=0,n=1;
    sum(&s,&n);
}
void sum(int *s, int *n){
       while(*n<=10){
        *s =*s+*n;
        (*n)++;
    }
    printf("%d",*s);
}