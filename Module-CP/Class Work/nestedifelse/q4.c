#include<stdio.h>
int main(){
    int male,female;
    printf("Enter the age of MALE:");
    scanf("%d",&male);
      printf("Enter the age of FEMALE:");
    scanf("%d",&female);
    if(male>=21 && female>=18){
        printf("Both are eligible!");
    }
    else{
        if(male>=21 && female<18){
            printf("Male is eligile female is not eligible");
        }else{
            if(female>=18 && male<21){
                printf("Female is eligible male is not eligible");
            }else{
                printf("Both are not eligible");
            }
        }
    }
}