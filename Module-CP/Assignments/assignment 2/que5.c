#include<stdio.h>
int main(){
    char stud;
    int purchase;
    float dis;
    printf("Are you student:");
    scanf("%c",&stud);
    printf("Enter you shopping bill:");
    scanf("%d",&purchase);
    if(stud=='y'){
        if(purchase>500){
            dis = 0.20f*500;
            printf("%f",dis);
          }else{
            if(purchase<500){
                 dis = 0.10*500;
            }
          }

    }
    if(stud=='n'){
        if(purchase>600){
            dis = 0.15*500;
            printf("%f",dis);
          }else{
            printf("No Discount.");
          }

    }
    

}