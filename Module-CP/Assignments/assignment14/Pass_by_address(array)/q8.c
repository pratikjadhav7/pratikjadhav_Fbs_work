#include<stdio.h>
typedef struct Distance{
   int feet;
   int inch;
}Distance;
void storeDistance(Distance*,int);
void displayDistance(Distance*,int);
int main(){
    Distance arr[5];

    storeDistance(arr,5);
    displayDistance(arr,5);
}
void storeDistance(Distance*arr,int size){
    printf("Enter Details of Distance:");
    for(int i=0;i<size;i++){
        printf("Enter distance in feet:");
        scanf("%d",&arr[i].feet);
         printf("Enter distance in inch:");
        scanf("%d",&arr[i].inch);
    }
}
void displayDistance(Distance*arr,int size){
      printf("-----Distance Details-----");
        for(int i=0;i<size;i++){
        printf("\nfeet = %d",arr[i].feet);
        printf("\ninch = %d",arr[i].inch);
        }
    }