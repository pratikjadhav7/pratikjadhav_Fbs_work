#include<stdio.h>
int main(){
    int s;
    printf("Enter Size of Array:");
    scanf("%d",&s);
    int arr[s];
    printf("Enter Elements in Array:");
    for(int i=0;i<s;i++){
        scanf("%d",&arr[i]);
    }
    printf("Array:");
    for(int i=0;i<s;i++){
        printf("%d ",arr[i]);
    }
    for(int i=0;i<s;i++){
        for(int j=0;j<s-1;j++){
            if(arr[j]<arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
     printf("\nDecending Order of Array:");
     for (int i=0;i<s;i++) {
        printf("%d ",arr[i]);
     }
}