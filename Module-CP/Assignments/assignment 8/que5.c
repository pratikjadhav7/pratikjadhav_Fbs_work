#include<stdio.h>
int main(){
    int arr[10];
    printf("Enter elements:\n");
    for(int i=0;i<10;i++){
        scanf("%d ",&arr[i]);
    }
    printf("Alternates elements are:");
    for(int i=0;i<10;i+=2){
        printf("%d ",arr[i]);
    }
}