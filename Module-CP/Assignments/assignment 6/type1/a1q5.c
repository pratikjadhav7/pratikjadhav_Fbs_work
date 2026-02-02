#include<stdio.h>
void isVoter();
int main(){
    isVoter();
   
}
void isVoter(){
     int age = 21;
    if(age>=18){
        printf("Yes,You are eligible for voting!");
    }else{
        printf("Sorry,Try next time!");
    }
}