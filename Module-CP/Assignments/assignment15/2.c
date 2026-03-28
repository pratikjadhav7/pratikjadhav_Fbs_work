#include<stdio.h>
#include<string.h>
typedef struct Time{
    int hrs,min,secs;
}Time;

Time storeTime();
void displayTime(Time);
Time addTime(Time, Time);
int totalSec(Time);
int main(){
   Time t1,t2,sum;

   t1=storeTime();
   t2=storeTime();

   displayTime(t1);
   displayTime(t2);
   
   sum=addTime(t1,t2);
   printf("\nSum Of Times:");
   displayTime(sum);

   printf("\n\nTime1 in seconds: %d", totalSec(t1));
   printf("\nTime2 in seconds: %d", totalSec(t2));
   
}
Time storeTime(){
    Time t;
    printf("Enter hrs:");
    scanf("%d",&t.hrs);
    printf("Enter Min:");
    scanf("%d",&t.min);
    printf("Enter Secs:");
    scanf("%d",&t.secs);

    

    return t;
}
void displayTime(Time t){
      printf("\nhrs:%d",t.hrs);
      printf("\nMin:%d",t.min);
      printf("\nSecs:%d",t.secs);
}
Time addTime(Time t1,Time t2){
    Time total;

    total.secs=t1.secs+t2.secs;
    total.min=t1.min+t2.min;
    total.hrs=t1.hrs+t2.hrs;

    if(total.secs>=60){
        total.min+=total.secs/60;
        total.secs+=total.secs%60;
    }

    if(total.min>=60){
        total.hrs+=total.min/60;
        total.min+=total.min%60;
    }
    return total;
}
int totalSec(Time t){
    return (t.hrs * 3600) + (t.min * 60) + t.secs;
}