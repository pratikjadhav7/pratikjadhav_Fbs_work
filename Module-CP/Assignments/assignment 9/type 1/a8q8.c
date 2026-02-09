#include<stdio.h>
void merGed();
int main(){
     merGed();
}
void merGed(){
    int s1,s2;
    printf("\nEnter the Size Of Array-1:");
    scanf("%d",&s1);
    int arr[s1];
    printf("\nEnter the Elements in Array-1:\n");
    for(int i=0;i<s1;i++){
        scanf("%d",&arr[i]);
    }
    printf("Array-1: ");
    for(int i=0;i<s1;i++){
        printf("%d ",arr[i]);
    }
    printf("\nEnter the Size Of Array-2:");
    scanf("%d",&s2);
    int arr1[s2];
    printf("\nEnter the Elements in Array-2:\n");
    for(int i=0;i<s2;i++){
        scanf("%d",&arr1[i]);
    }
    printf("Array-2: ");
    for(int i=0;i<s2;i++){
        printf("%d ",arr1[i]);
    }
    int s3=s1+s2;
    int arr3[s3];
     for(int i=0;i<s1;i++){
        arr3[i]=arr[i];
    }
     for(int i=0;i<s2;i++){
        arr3[s2++]=arr1[i];
    }
    printf("\nMerged Array:\n");
     for(int i=0;i<s3;i++){
        printf("%d ",arr3[i]);
    }
}
