#include<stdio.h>
void isDis();
int main(){
    isDis();
}
void isDis(){
        char stud;
    int purchase;
    float dis;
    printf("Are you student:");
    scanf("%c",&stud);
    printf("Enter you shopping bill:");
    scanf("%d",&purchase);
    if(stud=='y'){
        if(purchase>500)
            dis = 0.20*purchase;
            printf("%f",dis);
          else if(purchase<500)
                 dis = 0.10*purchase;
                 printf("%f",dis);
          }
    if(stud=='n'){
        if(purchase>600)
            dis = 0.15*purchase;
            printf("%f",dis);
          else
            printf("No Discount.");
    }
}