#include<stdio.h>
void alternateNo();
int main(){
     alternateNo();
}
void alternateNo(){
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
    printf("\nAlternate Elements of Array:\n");
    for(int i=0;i<s;i+=2){
        printf("%d ",arr[i]);
    }
}