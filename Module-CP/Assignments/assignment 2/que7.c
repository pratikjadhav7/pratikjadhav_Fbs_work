#include<stdio.h>
int main(){
    int age;
    printf("Enter your age:");
    scanf("%d",&age);
    if(age>60){
        printf("Senior");

    }
    else{
        if(age<12){
            printf("Child");
        }else{
            if(age>=12 && age<=19){
                printf("Teenager");
            }else{
                printf("Adult");
            }
        }
    }
}