#include<stdio.h>
typedef struct Date{
   int d;
   int mm;
   int yyyy;
}Date;
void storeDate(Date*,int);
void displayDate(Date*,int);
int main(){
    Date arr[5];

    storeDate(arr,5);
    displayDate(arr,5);
}
void storeDate(Date*arr,int size){
    printf("Enter Details of Date:");
    for(int i=0;i<size;i++){
        printf("Enter day:");
        scanf("%d",&arr[i].d);
        printf("Enter month:");
        scanf("%d",&arr[i].mm);
        printf("Enter year:");
        scanf("%d",&arr[i].yyyy);
    }
}
void displayDate(Date*arr,int size){
      printf("-----Date Details-----");
        for(int i=0;i<size;i++){
        printf("\nDay = %d",arr[i].d);
        printf("\nMonth = %d",arr[i].mm);
        printf("\nYear = %d",arr[i].yyyy);
    }
}