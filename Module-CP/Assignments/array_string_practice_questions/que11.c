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
    printf("\nEnter the position to delete Element:");
    int pos;
    scanf("%d",&pos);
     for(int i=pos-1;i<s-1;i++){
            arr[i]=arr[i+1];
    }
    s--;
    printf("\nUpdated Array: ");
    for(int i = 0; i <= s; i++){
        printf("%d ", arr[i]);
    }

}