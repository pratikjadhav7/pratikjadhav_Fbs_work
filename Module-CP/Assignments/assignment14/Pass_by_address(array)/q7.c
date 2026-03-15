#include<stdio.h>
typedef struct Time{
   int hr;
   int min;
   int secs;
}Time;
void storeTime(Time*,int);
void displayTime(Time*,int);
int main(){
    Time arr[5];

    storeTime(arr,5);
    displayTime(arr,5);
}
void storeTime(Time*arr,int size){
    printf("Enter Details of Time:\n");
    for(int i=0;i<size;i++){
         printf("Enter hrs:");
        scanf("%d",&arr[i].hr);
        printf("Enter min:");
        scanf("%d",&arr[i].min);
        printf("Enter secs:");
        scanf("%d",&arr[i].secs);
    }
}
void displayTime(Time*arr,int size){
      printf("-----Date DetTime-----");
        for(int i=0;i<size;i++){
        printf("\nHrs = %d",arr[i].hr);
        printf("\nMin = %d",arr[i].min);
        printf("\nSecs = %d",arr[i].secs);
    }
}