#include<stdio.h>
void aReverse();
int main(){
    aReverse();
}
void aReverse(){
    int s;
    printf("Enter the size of Array:");
    scanf("%d",&s);
    int arr[s];
    printf("Enter the Elements in Array:\n");
    for(int i=0;i<s;i++){
       scanf("%d",&arr[i]); 
    }
    printf("Array:\n");
    for(int i=0;i<s;i++){
       printf("%d ",arr[i]); 
    }
    int start=0 ; int end=s-1;
       while (end>start) {
           int temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
       
    }
      printf("Reversed Array");
      for(int i=0;i<s;i++){
       printf("%d ",arr[i]);
       }
  
}