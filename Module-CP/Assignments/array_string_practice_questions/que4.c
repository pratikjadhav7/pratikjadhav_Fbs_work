#include<stdio.h>
int main(){
    int s;
    int n=7;
    int count=0;
    printf("Enter size of Array:");
    scanf("%d",&s);
    int arr[s];
    printf("Enter Elements in Array:");
    for(int i=0;i<s;i++){
        scanf("%d",&arr[i]);
    }
    printf("Array:");
    for(int i=0;i<s;i++){
        printf("%d ",arr[i]);
    }
    for(int i=0;i<s;i++){
        if(arr[i]==n){
            count++;
        }
    }
    printf("\n%d is repeated for %d times",n,count);
}