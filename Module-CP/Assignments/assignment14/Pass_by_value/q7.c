#include<stdio.h>
typedef struct Time{
    int hours,mins,sec;
}Time;
Time storeDate();
void display(Time);
int main(){
    Time t1,t2;
    t1=storeDate();
    t2=storeDate();

    display(t1);
    display(t2);
}
Time storeDate(){
    Time t;
    printf("Enter hours:");
    scanf("%d",&t.hours);
    printf("Enter Min:");
    scanf("%d",&t.mins);
    printf("Enter sec:");
    scanf("%d",&t.sec);

    return t;
}
void display(Time d){
     printf("\nHrs:%d",d.hours);
     printf("\nMins:%d",d.mins);
     printf("\nSecs:%d",d.sec );
}