#include<stdio.h>
int main(){
    int arr[10];
    printf("Enter Number:");
    for(int i=0;i<10;i++){
        scanf("%d",&arr[i]);
    }
    int min=arr[0];
    int max=arr[0];
    for(int i=0;i<10;i++){
        if(min>arr[i])
        min=arr[i];
        if(max<arr[i])
        max=arr[i];
    }
    printf("Min number is:%d\n",min);
    printf("Max number is:%d",max);
}