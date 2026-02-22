#include<stdio.h>
int main(){
    int s;
    int count=0;
    printf("Enter Size Of Array:");
    scanf("%d",&s);
    int arr[s];
    printf("Enter elements in Array:");
    for(int i=0;i<s;i++){
        scanf("%d",&arr[i]);
    }
    printf("Array:");
    for(int i=0;i<s;i++){
        printf("%d ",arr[i]);
    }
    for(int i=0;i<s;i++){
        for(int j=i+1;j<s;j++){
            if(arr[i]==arr[j]){
                count++;
                break;
            }
        }
    }
    printf("\nNumber of duplicate Elements:%d",count);
}