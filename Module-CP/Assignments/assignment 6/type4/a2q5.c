#include<stdio.h>
float isDis(char,int);
int main(){
    char stud;
    int purchase;
    printf("Are you student:");
    scanf("%c",&stud);
    printf("Enter you shopping bill:");
    scanf("%d",&purchase);
   float res= isDis(stud,purchase);
   printf("%f",res);
}
float isDis(char stud,int purchase){
    float dis;
    if(stud=='y'){
        if(purchase>500){
            dis = 0.20*purchase;
            printf("%f",dis);
          }else{
            if(purchase<500){
                 dis = 0.10*purchase;
                 printf("%f",dis);
            }
          }

    }
    if(stud=='n'){
        if(purchase>600){
            dis = 0.15*purchase;
            printf("%f",dis);
          }else
            printf("No Discount.");
          

    }return dis;
}