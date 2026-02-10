#include<stdio.h>
int main(){
    int s1,s2,s3;
    printf("Enter the size of Array 1:");
    scanf("%d",&s1);
    int arr[s1];
    printf("Enter Elements for Array 1:\n");
    for(int i=0;i<s1;i++){
        scanf("%d",&arr[i]);
    }
    printf("Array 1:\n");
    for(int i=0;i<s1;i++){
        printf("%d ",arr[i]);
    }
    printf("\nEnter the size of Array 2:");
    scanf("%d",&s2);
    int arr2[s2];
    printf("Enter Elements for Array 2:\n");
    for(int i=0;i<s2;i++){
        scanf("%d",&arr2[i]);
    }
    printf("Array 2:\n");
    for(int i=0;i<s2;i++){
        printf("%d ",arr2[i]);
    }
    int minSize = (s1 < s2) ? s1 : s2;
    int arr3[minSize];
    printf("\nSum Of Array 1 & Array 2:\n");
    for(int i=0;i<minSize;i++){
        arr3[i]=arr[i]+arr2[i];
        printf("%d ",arr3[i]);
    }
}
