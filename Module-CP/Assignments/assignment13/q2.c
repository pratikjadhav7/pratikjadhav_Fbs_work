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
    int n;
    printf("\nEnter Num to Find:");
    scanf("%d",&n);
    for(int i=0;i<s;i++){
        if(arr[i]==n){
        found=1;
        break;
        }
    }
    if(found==1)
    printf("Found");
    else
    printf("Not Found");
}