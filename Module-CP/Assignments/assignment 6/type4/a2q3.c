#include<stdio.h>
int isGreater(int ,int ,int);
    int main(){
        int num1,num2,num3;
        printf("Enter the numbers:\n");
        printf("Num1:");
        scanf("%d",&num1);
        printf("Num2:");
        scanf("%d",&num2);
        printf("Num3:");
        scanf("%d",&num3);
       int res=isGreater(num1,num2,num3);
        if(res==1){
         printf("a is greater");
        }else if(res==2){
         printf("b is greater");
        }else{
            printf("c is greater");
        }
    }
int isGreater(int a,int b,int c){
        if(a>b){
            if(a>c){
              return 1;
            }
        }
        if(b>a){
            if(b>c){
                return 2;
            }
        }
        if(c>a){
            if(c>b){
                return 0;
            }
        }
    }