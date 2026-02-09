#include<stdio.h>
void aReverse(int s,int*arr,int start,int end);
int main(){
    int s;
    printf("Enter the size of Array:");
    scanf("%d",&s);
    int arr[s];
    int start=0 ; int end=s-1;
    aReverse(s,arr,start,end);
}
void aReverse(int s,int*arr,int start,int end){
    
    printf("Enter the Elements in Array:\n");
    for(int i=0;i<s;i++){
       scanf("%d",&arr[i]); 
    }
    printf("Array:\n");
    for(int i=0;i<s;i++){
       printf("%d ",arr[i]); 
    }
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