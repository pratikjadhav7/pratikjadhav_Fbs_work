#include<stdio.h>
#include<stdlib.h>
int main(){
    int s;
    printf("Enter Size Of array:");
    scanf("%d",&s);
    int*arr=(int*)malloc(sizeof(int)*s);
    printf("\nEnter elements in array:");
    for(int i=0;i<s;i++){
        scanf("%d",&arr[i]);
    }
    printf("\nArray:");
    for(int i=0;i<s;i++){
        printf("%d ",arr[i]);
    }
    for(int i=0;i<s;i++){
        for(int j=0;j<s-1;j++){
            if (arr[j]>arr[j+1]) {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    printf("\nSorted Array:");
    for(int i=0;i<s;i++){
         printf("%d ",arr[i]);
    }
}
