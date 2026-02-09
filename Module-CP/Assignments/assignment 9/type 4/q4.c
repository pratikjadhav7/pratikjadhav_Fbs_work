#include<stdio.h>
int evenOdd(int,int*);
int main(){
     int s;
    printf("Enter the Size Of Array:");
    scanf("%d",&s);
    int arr[s];
    int evenCount= evenOdd(s,arr);
    printf("\nEVEN: %d",evenCount);
    return 0;
}
int evenOdd(int s,int *arr){
   
    printf("Enter the Elements in Array:\n");
    for(int i=0;i<s;i++){
        scanf("%d",&arr[i]);
    }
    for(int i=0;i<s;i++){
        printf("%d ",arr[i]);
    }
    int evenCount=0;
    printf("\nEven Numbers:\n");
    for(int i=0;i<s;i++){
        if(arr[i]%2==0){
        printf("%d ",arr[i]);
        evenCount++;
        }
    }
   // int oddCount=0;
    printf("\nOdd Numbers:\n");
    for(int i=0;i<s;i++){
        if(arr[i]%2!=0){
        printf("%d ",arr[i]);
    // oddCount++;
        }
    }
    return evenCount;
   // return oddCount;
}