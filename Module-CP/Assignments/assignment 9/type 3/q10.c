#include<stdio.h>
void aReverse(int,int*);
int main(){
    int s;
    printf("Enter the size of Array:");
    scanf("%d",&s);
    int arr[s];
    aReverse(s,arr);
}
void aReverse(int s,int*arr){
    
    printf("Enter the Elements in Array:\n");
    for(int i=0;i<s;i++){
       scanf("%d",&arr[i]); 
    }
    printf("Array:\n");
    for(int i=0;i<s;i++){
       printf("%d ",arr[i]); 
    }
    for (int i=0;i<s;i++){
        for (int j=0;j<s-1;j++){
       while (arr[j]<arr[j+1]) {
           int temp=arr[j];
           arr[j]=arr[j+1];
           arr[j+1]=temp;
        }
    }
}
      printf("\nSorted Array:\n");
      for(int i=0;i<s;i++){
       printf("%d ",arr[i]);
       }
  
}