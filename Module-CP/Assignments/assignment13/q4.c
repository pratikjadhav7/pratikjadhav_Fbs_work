#include<stdio.h>
#include<stdlib.h>
int main(){
    int s;
    int found=0;
    printf("Enter Size Of Array:");
    scanf("%d",&s);
    int*arr=(int*)malloc(sizeof(int)*s);
    printf("Enter elements in Array:");
    for(int i=0;i<s;i++){
        scanf("%d",&arr[i]);
    }
    printf("\nArray:");
    for(int i=0;i<s;i++){
        printf("%d ",arr[i]);
    }
    printf("\nEven Num:");
    for(int i=0;i<s;i++){
        if(arr[i]%2==0){
            printf("%d ",arr[i]);
        }
    }
    printf("\nOdd Num:");
    for(int i=0;i<s;i++){
         if(arr[i]%2!=0){
            printf("%d ",arr[i]);
        }
    }
}