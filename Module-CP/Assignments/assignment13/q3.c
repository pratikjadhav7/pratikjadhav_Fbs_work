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
     int sum=0;
    printf("\nSum of Elements of Array:");
    for(int i=0;i<s;i++){
        sum+=arr[i];
    }
     printf("%d",sum);
   
}