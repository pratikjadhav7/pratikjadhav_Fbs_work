#include<stdio.h>
void evenOdd();
int main(){
     evenOdd();
}
void evenOdd(){
    int s;
    printf("Enter the Size Of Array:");
    scanf("%d",&s);
    int arr[s];
    printf("Enter the Elements in Array:\n");
    for(int i=0;i<s;i++){
        scanf("%d",&arr[i]);
    }
    for(int i=0;i<s;i++){
        printf("%d ",arr[i]);
    }
    printf("\nEven Numbers:\n");
    for(int i=0;i<s;i++){
        if(arr[i]%2==0)
        printf("%d ",arr[i]);
    }
    printf("\nOdd Numbers:\n");
    for(int i=0;i<s;i++){
        if(arr[i]%2!=0)
        printf("%d ",arr[i]);
    }
}