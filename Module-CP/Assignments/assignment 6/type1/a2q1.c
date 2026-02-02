#include<stdio.h>
void performOp();
int main(){
    performOp();

}
void performOp(){
    int num1,num2;
    char op;
    float res;
    printf("Enter 1st Num:");
    scanf("%d",&num1);
    printf("Enter 2nd Num:");
    scanf("%d",&num2);
    printf("Enter op to perform operation:");
    scanf(" %c",&op);
    if(op=='+'){
        res = num1+num2;
        printf("%d + %d = %f",num1,num2,res);

    }else{
        if(op=='-'){
            res = num1-num2;
                printf("%d - %d = %f",num1,num2,res);
        }else{
            if(op=='%'){
                res = num1%num2;
                    printf("%d / %d = %f",num1,num2,res);
            }else{
               if(num1*num2){
                res = num1*num2;
                    printf("%d * %d = %f",num1,num2,res);
               } 
            }
        }
    }
}