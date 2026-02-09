#include<stdio.h>
int  sum();
int main(){
    int res= sum();
    printf("SUM:%d",res);
}
int  sum(){
        int s;
    printf("Enter the Size Of Array:");
    scanf("%d",&s);
    int arr[s];
     printf("Enter the Elements in Array:");
    for(int i=0;i<s;i++){
        scanf("%d",&arr[i]);
    }
    for(int i=0;i<s;i++){
        printf("%d ",arr[i]);
    }
    int sum=0;
    for(int i=0;i<s;i++){
        sum=sum+arr[i];
    }
    return sum;
}