#include<stdio.h>
void isGreater();
    int main(){
        isGreater();
    }
void isGreater(){
            int num1,num2,num3;
        printf("Enter the numbers:\n");
        printf("Num1:");
        scanf("%d",&num1);
        printf("Num2:");
        scanf("%d",&num2);
        printf("Num3:");
        scanf("%d",&num3);
        if(num1>num2){
            if(num1>num3){
                printf("%d is greater than %d and %d",num1,num2,num3);
            }
        }
        if(num2>num1){
            if(num2>num3){
                printf("%d is greater than %d and %d",num2,num1,num3);
            }
        }
        if(num3>num1){
            if(num3>num2){
                printf("%d is greater than %d and %d",num3,num1,num2);
            }
        }
}