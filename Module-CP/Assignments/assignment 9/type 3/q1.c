#include<stdio.h>
void minMax(int,int*);
int main(){
        int s;
    printf("Enter the size of Array:");
    scanf("%d",&s);
    int arr[s];
     minMax(s,arr);
}
void minMax(int s,int*arr){

    printf("Enter the Elements in Array:\n");
    for(int i=0;i<s;i++){
       scanf("%d",&arr[i]); 
    }
    printf("Array:\n");
    for(int i=0;i<s;i++){
       printf("%d ",arr[i]); 
    }
    int min=arr[0];
    int max=arr[0];
    for(int i=0;i<s;i++){
        if(min>arr[i])
        min=arr[i];
        if(max<arr[i])
        max=arr[i];
    }
    printf("\nMIN:%d",min);
    printf("\nMAX:%d",max);
}