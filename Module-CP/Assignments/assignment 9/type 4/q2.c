#include<stdio.h>
int isFound(int s,int*arr,int n,int found);
int main(){
    int s;
    int found=0;
    printf("Enter the size Of Array:");
    scanf("%d",&s);
    int arr[s];
    int n;
   int res= isFound(s,arr,n,found);
   if(res==1)
   printf("Found");
   else
   printf("Not found");
}
int isFound(int s,int*arr,int n,int found){

    printf("\nEnter the Elements in Array:\n");
    for (int i=0;i<s;i++){
        scanf("%d",&arr[i]);
    }
    for (int i=0;i<s;i++){
        printf("%d ",arr[i]);
    }
    printf("\nEnter Num which you want to find:");
    scanf("%d",&n);
    for(int i=0;i<s;i++){
        if(arr[i]==n){
        found=1;
    }
   
}
 if(found==1)
    return 1;
    else
    return 0;
}