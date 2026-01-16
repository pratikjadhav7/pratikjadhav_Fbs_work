#include<stdio.h>
int main(){
    int hrs,min,sec;
    printf("Enter the time (hr):");
    scanf("%d",&hrs);
    printf("Enter the time (min):");
     scanf("%d",&min);
    int totalsec=hrs*3600+min*60;
    printf("Total Secs are:%d",totalsec);
}