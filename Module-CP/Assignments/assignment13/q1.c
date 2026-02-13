#include<stdio.h>
#include<stdlib.h>
int main(){
    int s;
    printf("Enter the Size of array:");
    scanf("%d",&s);
    int*arr=(int*)malloc(sizeof(int)*s);
    printf("Enter Elements in array:");
    for(int i=0;i<s;i++){
       scanf("%d",&arr[i]);
    }
    printf("Rrray:");
    for(int i=0;i<s;i++){
       printf("%d",arr[i]);
    }
    int min=arr[0];
    int max=arr[0];
    for(int i=0;i<s;i++){
       if(min>arr[i])
       min=arr[i];
       if(max<arr[i])
       max=arr[i];
    }
    printf("MIN:%d",min);
    printf("MAX:%d",max);
}