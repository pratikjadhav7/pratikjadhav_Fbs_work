#include<stdio.h>
#include<stdlib.h>
int main(){
    int s1,s2;
    printf("Enter Size Of array-1:");
    scanf("%d",&s1);
    int*arr1=(int*)malloc(sizeof(int)*s1);
    printf("\nEnter elements in array-1:");
    for(int i=0;i<s1;i++){
        scanf("%d",&arr1[i]);
    }
    printf("\nArray-1:");
    for(int i=0;i<s1;i++){
        printf("%d ",arr1[i]);
    }
    printf("\nEnter Size Of array-2:");
    scanf("%d",&s2);
    int*arr2=(int*)malloc(sizeof(int)*s2);
    printf("\nEnter elements in array-2:");
    for(int i=0;i<s2;i++){
        scanf("%d",&arr2[i]);
    }
    printf("\nArray-2:");
    for(int i=0;i<s2;i++){
        printf("%d ",arr2[i]);
    }
    int s3=s1+s2;
    int*arr3=(int*)malloc(sizeof(int)*s3);
     for(int i=0;i<s1;i++){
        arr3[i]=arr1[i];
    }
     for(int i=0;i<s2;i++){
        arr3[s2+i]=arr2[i];
    }
    printf("\nMerged:");
     for(int i=0;i<s3;i++){
        printf("%d ",arr3[i]);
    }
}