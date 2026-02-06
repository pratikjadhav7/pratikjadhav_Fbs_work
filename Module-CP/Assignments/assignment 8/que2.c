#include<stdio.h>
int main(){
    int found=0;
    int arr[10];
    printf("Enter 10 Elements in Array: ");
    for(int i=0;i<10;i++){
        scanf("%d",&arr[i]);
        if(arr[i]==7)
        found=1;
    }
    if(found==1)
    printf("\nFound");
    else
     printf("Not found");
}