#include<stdio.h>
int main(){
    int s;
    int isDuplicate=0;
    int count,k=0;
    printf("Enter Size Of Array:");
    scanf("%d",&s);
    int arr[s];
    int temp[s];
    printf("Enter elements in Array:");
    for(int i=0;i<s;i++){
        scanf("%d",&arr[i]);
    }
    printf("Array:");
    for(int i=0;i<s;i++){
        printf("%d ",arr[i]);
    }
    for(int i=0;i<s;i++){
        int isDuplicate = 0;
        for(int j=0;j<k;j++){
            if(arr[i]==temp[j]){
                isDuplicate=1;
                break;
            }
        }
    if(!isDuplicate){
        temp[k]=arr[i];
        k++;
    }
    }
    printf("After removing duplicate elements");
    for(int i=0;i<k;i++){
        printf("%d ",temp[i]);
    }
}