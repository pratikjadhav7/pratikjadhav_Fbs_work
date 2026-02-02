#include<stdio.h>
void isGreater(int ,int ,int);
    int main(){
        int num1,num2,num3;
        printf("Enter the numbers:\n");
        printf("Num1:");
        scanf("%d",&num1);
        printf("Num2:");
        scanf("%d",&num2);
        printf("Num3:");
        scanf("%d",&num3);
        isGreater(num1,num2,num3);
    }
void isGreater(int a,int b,int c){
        if(a>b){
            if(a>c){
                printf("%d is greater than %d and %d",a,b,c);
            }
        }
        if(b>a){
            if(b>c){
                printf("%d is greater than %d and %d",b,a,c);
            }
        }
        if(c>a){
            if(c>b){
                printf("%d is greater than %d and %d",c,a,b);
            }
        }
}