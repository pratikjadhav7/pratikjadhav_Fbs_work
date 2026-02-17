#include<stdio.h>
void table(int*);
int main(){
    int n = 1;
    table(&n);
}
void table(int *n){
     int tab;
     while(*n<=10){
        tab = 5*(*n);
        printf("%d\n",tab);
        (*n)++;
    }
}