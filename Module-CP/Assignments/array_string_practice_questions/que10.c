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
    printf("\nEnter the position where you want to insert Element:");
    int pos;
    scanf("%d",&pos);
    printf("Enter Element to insert:");
    int e;
    scanf("%d",&e);
     for(int i=s;i>pos;i--){
            arr[i]=arr[i-1];
    }
    arr[pos - 1] = e;
    printf("\nUpdated Array: ");
    for(int i = 0; i <= s; i++){
        printf("%d ", arr[i]);
    }

}