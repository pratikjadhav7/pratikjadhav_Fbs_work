#include<stdio.h>
int main(){
    int arr[10];
    printf("Enter 10 Numbers to Find Even & Odd Numbers:");
    for(int i=0;i<10;i++){
    scanf("%d",&arr[i]);
        
    }  
    printf("Even Numbers:\n"); 
    for(int i=0;i<10;i++){ 
    if(arr[i]%2==0)
      printf("%d ",arr[i]);  
   }
   printf("Odd Numbers:\n"); 
    for(int i=0;i<10;i++){ 
    if(arr[i]%2!=0)
    printf("%d ",arr[i]);  
   }
}