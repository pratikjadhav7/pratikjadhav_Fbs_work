#include<stdio.h>
void isVoter(int);
int main(){
    int age = 21;
    isVoter(age);
   
}
void isVoter(int a){
    if(a>=18){
        printf("Yes,You are eligible for voting!");
    }else{
        printf("Sorry,Try next time!");
    }
}