#include<stdio.h>
int isGreater();
    int main(){
       int res= isGreater();
    if(res == 1)
        printf("Num1 is greatest");
    else if(res == 2)
        printf("Num2 is greatest");
    else if(res == 3)
        printf("Num3 is greatest");
    else
        printf("All numbers are equal");
    return 0;
       
    }
int isGreater(){
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
                return 1;
            }
        }
        if(num2>num1){
            if(num2>num3)
                return 2;
        }
        if(num3>num1){
            if(num3>num2){
               return 3;
        }
}
}