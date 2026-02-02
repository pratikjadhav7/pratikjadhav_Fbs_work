#include<stdio.h>
int isVoter();
int main(){
   int res= isVoter();
   if(res==1)
    printf("Yes,You are eligible for voting!");
else
 printf("Sorry,Try next time!");

   
}
int isVoter(){
     int age = 21;
    if(age>=18){
        return 1;
    }else{
        return 0;
    }
}