#include<stdio.h>
int main(){
    int marks;
    printf("Enter your marks:");
    scanf("%d",&marks);
    if(marks>=75){
        printf("A+");
    }
    else{
        if(marks>=65){
            printf("B+");
        }else{
            if(marks>=45){
                printf("C+");
            }
            else{
            if(marks<=35){
                printf("fail");
            }
        }
             } 
    }
}