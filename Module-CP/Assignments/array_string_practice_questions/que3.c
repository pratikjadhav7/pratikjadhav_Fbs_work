#include<stdio.h>
int main(){
    int s;
    printf("Enter Size of array:");
    scanf("%d",&s);
    int arr[s];
    printf("Enter elements in array:");
    for(int i=0;i<s;i++){
        scanf("%d",&arr[i]);
    }
    printf("array:");
    for(int i=0;i<s;i++){
        printf("%d ",arr[i]);
    }
    int temp = arr[0];
    arr[0] = arr[s - 1];
    arr[s - 1] = temp;
    printf("\nAfter Swapping first and last: ");
    for (int i = 0; i < s; i++) {
        printf("%d ", arr[i]);
    }

}