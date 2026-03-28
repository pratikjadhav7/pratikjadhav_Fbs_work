#include<stdio.h>
#include<string.h>
typedef struct System{
   char name[20];
   float price,quantity;
}System;
System storeData(System*,int);
void displayData(System*,int);
float totalCost(System*,int);
int main(){
    System arr[5];
    
    printf("------ Add Items -------");
    storeData(arr,5);

    displayData(arr,5);
  
    float sum=totalCost(arr,5);
    printf("\nTotal Cost Of Products:%f",sum);
}
System storeData(System*arr,int size){

    for(int i=0;i<size;i++){
    printf("\nProduct Name:");
    scanf("%s",arr[i].name);
    printf("\nProduct Price:");
    scanf("%f",&arr[i].price);
    printf("\nQuantity:");
    scanf("%f",&arr[i].quantity);
    }

}
void displayData(System* arr,int size){
    for(int i=0;i<size;i++){
    printf("\nProduct Name:%s",arr[i].name);
    printf("\nProduct Price:%f",arr[i].price);
    printf("\nQuantity:%f",arr[i].quantity);
    }
}
float totalCost(System*arr,int size){
    float sum=0;
    for(int i=0;i<size;i++){
    sum+=arr[i].price;
    }
    return sum;

}