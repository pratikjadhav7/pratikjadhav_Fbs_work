#include<stdio.h>
void num(int*);
int main(){
    int n = 1;
    num(&n);
}
void num(int *a){
     while(*a<=10){
        printf("%d ",*a);
        (*a)++;
    }
}