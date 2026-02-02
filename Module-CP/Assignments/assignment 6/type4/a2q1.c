#include<stdio.h>
float performOp(int,int,char);
int main(){
    int num1,num2;
    char op;
    printf("Enter 1st Num:");
    scanf("%d",&num1);
    printf("Enter 2nd Num:");
    scanf("%d",&num2);
    printf("Enter op to perform operation:");
    scanf(" %c",&op);
    float res=performOp(num1,num2,op);
    printf("%f",res);

}
float performOp(int num1,int num2,char op){
    float res;
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
    return res;}
}