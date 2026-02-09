#include<stdio.h>
void minMax();
int main(){
     minMax();
}
void minMax(){
        int s;
    printf("Enter the size of Array:");
    scanf("%d",&s);
    int arr[s];
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