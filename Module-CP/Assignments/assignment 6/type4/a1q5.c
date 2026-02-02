#include<stdio.h>
int isVoter(int);
int main(){
    int age = 21;
   int res= isVoter(age);
   if(res==1) 
   printf("Yes,You are eligible for voting!");
else
 printf("Sorry,Try next time!"); 
}
int isVoter(int a){
    if(a>=18)
       return 1;
    else
        return 0; 
}