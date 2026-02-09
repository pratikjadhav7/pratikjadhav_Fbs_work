#include<stdio.h>
int minMax(int s,int*arr,int min,int max);
int main(){
    int s;
    printf("Enter the size of Array:");
    scanf("%d",&s);
    int arr[s];
    int min=arr[0];
    int max=arr[0];
    int res= minMax(s,arr,min,max);
   printf("\nRESULT:%d",res);
}
int minMax(int s,int*arr,int min,int max){

    printf("Enter the Elements in Array:\n");
    for(int i=0;i<s;i++){
       scanf("%d",&arr[i]); 
    }
    printf("Array:\n");
    for(int i=0;i<s;i++){
       printf("%d ",arr[i]); 
    }
   
    for(int i=0;i<s;i++){
        if(min>arr[i])
        min=arr[i];
        if(max<arr[i])
        max=arr[i];
    }
    printf("\nMIN:%d",min);
    printf("\nMAX:%d",max);
   // return min;
    return max;
}