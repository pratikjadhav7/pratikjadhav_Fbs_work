#include<stdio.h>
int main(){
    int s1,s2;
    int count=0;
    printf("Enter Size of Array-1");
    scanf("%d",&s1);
    int arr1[s1];
    printf("Enter Elements:");
    for(int i=0;i<s1;i++){
        scanf("%d",&arr1[i]);
    }
    printf("Array-1:");
    for(int i=0;i<s1;i++){
        printf("%d ",arr1[i]);
    }
    printf("\nEnter Size of Array-2");
    scanf("%d",&s2);
    int arr2[s2];
    printf("Enter Elements:");
    for(int i=0;i<s2;i++){
        scanf("%d",&arr2[i]);
    }
    printf("Array-2:");
    for(int i=0;i<s2;i++){
        printf("%d ",arr2[i]);
    }
    printf("\nCommon Elements:");
    for(int i=0;i<s1;i++){
        for(int j=0;j<s2;j++){
            if(arr1[i]==arr2[j]){
                printf("%d ",arr1[i]);
                break;
            }
        }
    }
}