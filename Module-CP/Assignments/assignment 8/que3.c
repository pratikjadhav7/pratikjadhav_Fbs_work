#include<stdio.h>
int main(){
    int sum=0;
    int arr[10];
    printf("Enter 10 Elements in Array: ");
    for(int i=0;i<10;i++){
        scanf("%d",&arr[i]);
        sum=sum+arr[i];
    }
    printf("Sum of Entered elements:%d",sum);
}
        