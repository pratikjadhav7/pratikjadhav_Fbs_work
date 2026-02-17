#include<stdio.h>
void Fact(int* ,int*);
int main(){
    int f=1,n = 5;
    Fact(&f,&n);
}
void Fact(int* f,int* n){
        while(*n>0){
        *f = (*f)*(*n);
        (*n)--;
    }
    printf("%d",*f);
}