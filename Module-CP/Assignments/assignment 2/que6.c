#include<stdio.h>
int main(){
    int num;
    printf("Enter the Number:");
    scanf("%d",&num);
    if(num%3==0 && num%5==0){
       printf("%d is divisible by both.",num);
    }
    else{
        if(num%3==0 && num%5!=0){
            printf("%d is divisible by 3 not 5.",num);
        }else{
            if(num%5==0 && num%3!=0){
                printf("%d is divisible by 5 not 3.",num);
            }else{
                printf("%d Divisible by none.",num);
            }
        }
    }
}