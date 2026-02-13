#include<stdio.h>
#include<stdlib.h>
int main(){
    int s;
    printf("Enter Size Of array:");
    scanf("%d",&s);
    int*arr1=(int*)malloc(sizeof(int)*s);
    printf("\nEnter elements in array:");
    for(int i=0;i<s;i++){
        scanf("%d",&arr1[i]);
    }
    printf("\nArray:");
    for(int i=0;i<s;i++){
        printf("%d ",arr1[i]);
    }
    int start=0;int end=s-1;
        while(start<end){
            int temp=arr1[start];
            arr1[start]=arr1[end];
            arr1[end]=temp;
            start++;
            end--;
        }printf("\n Reversed Array:");
        for(int i=0;i<s;i++){
        printf("%d ",arr1[i]);
    }
    
}