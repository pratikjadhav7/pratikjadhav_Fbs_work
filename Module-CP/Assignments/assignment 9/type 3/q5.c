#include<stdio.h>
void alternateNo(int,int*);
int main(){
    int s;
    printf("Enter the Size Of Array:");
    scanf("%d",&s);
    int arr[s];
     alternateNo(s,arr);
}
void alternateNo(int s,int *arr){
    printf("Enter the Elements in Array:\n");
    for(int i=0;i<s;i++){
        scanf("%d",&arr[i]);
    }
    for(int i=0;i<s;i++){
        printf("%d ",arr[i]);
    }
    printf("\nAlternate Elements of Array:\n");
    for(int i=0;i<s;i+=2){
        printf("%d ",arr[i]);
    }
}