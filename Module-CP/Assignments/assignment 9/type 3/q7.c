#include<stdio.h>
void sumA(int s1,int s2,int*arr,int*arr1);
int main(){
    int s1,s2;
    printf("\nEnter the Size Of Array-1:");
    scanf("%d",&s1);
    int arr[s1];
    printf("\nEnter the Size Of Array-2:");
    scanf("%d",&s2);
    int arr1[s2];
     sumA(s1,s2,arr,arr1);
}
void sumA(int s1,int s2,int*arr,int*arr1){
   
    printf("\nEnter the Elements in Array-1:\n");
    for(int i=0;i<s1;i++){
        scanf("%d",&arr[i]);
    }
    for(int i=0;i<s1;i++){
        printf("%d ",arr[i]);
    }
    printf("\nEnter the Elements in Array-2:\n");
    for(int i=0;i<s2;i++){
        scanf("%d",&arr1[i]);
    }
    for(int i=0;i<s2;i++){
        printf("%d ",arr1[i]);
    }
    int minSize=(s1<s2)?s1:s2;
    int arr3[minSize];
    printf("\nSum of Array-1 & Array-2:\n");
    for(int i=0;i<minSize;i++){
        arr3[i]=arr[i]+arr1[i];
        printf("%d ",arr3[i]);
    }
   
}