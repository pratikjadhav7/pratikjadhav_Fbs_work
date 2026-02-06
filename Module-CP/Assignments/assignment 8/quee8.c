#include<stdio.h>
int main(){
    int s1,s2,s3;
    printf("Enter the size of Array 1:");
    scanf("%d",&s1);
    int arr1[s1];
    printf("Enter the size of Array 2:");
    scanf("%d",&s2);
    int arr2[s2];
    s3=s1+s2;
    int arr3[s3];
    printf("Enter array 1:");
    for(int i=0;i<s1;i++){
        scanf("%d",&arr1[i]);
    }
     for(int i=0;i<s1;i++){
        printf("%d ",arr1[i]);
    }
////////////////////////////////////////
    printf("\nEnter array 2:\n");
    for(int i=0;i<s2;i++){
        scanf("%d",&arr2[i]);
    }
    for(int i=0;i<s2;i++){
        printf("%d ",arr2[i]);
    }
///////////////////////////////////////
  for(int i=0;i<s1;i++){
        arr3[i]=arr1[i];
    }
  for(int i=0;i<s2;i++){
        arr3[s2++]=arr2[i];
    }
     printf("\nArray 3 will be:\n");
  for(int i=0;i<s3;i++){
         printf("%d ",arr3[i]);
    }
}