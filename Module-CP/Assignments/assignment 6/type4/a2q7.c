#include<stdio.h>
int isChild(int);
int main(){
    int age;
    printf("Enter your age:");
    scanf("%d",&age);
   int res= isChild(age);
   if(res==10)
    printf("Child");
   else if(res==2)
   printf("Teenager");
   else
   printf("Adult");
}
int isChild(int a){
    if(a>60){
        printf("Senior");

    }
    else{
        if(a<12){
           return 1;
        }else{
            if(a>=12 && a<=19){
                return 2;
            }else{
                return 0;
            }
        }
    }
}