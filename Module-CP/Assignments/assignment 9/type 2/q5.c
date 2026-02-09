#include<stdio.h>
int alternateNo();
int main(){
    int res= alternateNo();
    printf("\nResult:%d",res);
    return 0;
}
int alternateNo(){
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
    int count=0;
    for(int i=0;i<s;i+=2){
        printf("%d ",arr[i]);
        count++;
    }
    return count;
}