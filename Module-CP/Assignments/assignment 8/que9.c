#include<stdio.h>
int main(){
    int s;
    printf("Enter the Size of array:");
    scanf("%d",&s);
    int arr[s];
    for (int i=0;i<s;i++) {
       scanf("%d ",&arr[i]);
    }
     printf("\nArray Elements:\n");
    for (int i=0;i<s;i++) {
       printf("%d ",arr[i]);
    }
/////////////////////////////////////////
     int start=0 ; int end=s-1;
    while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        
        start++;
        end--;
    }
    printf("\nReversed array:\n");
    for (int i = 0; i < s; i++) {
    printf("%d ", arr[i]);
    }
}