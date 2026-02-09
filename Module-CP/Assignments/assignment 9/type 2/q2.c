#include<stdio.h>
int isFound();
int main(){
   int res= isFound();
   if(res==1)
   printf("Found");
   else
    printf("Not found");
}
int isFound(){
    int s;
    int found=0;
    printf("Enter the size Of Array:");
    scanf("%d",&s);
    int arr[s];
    printf("\nEnter the Elements in Array:\n");
    for (int i=0;i<s;i++){
        scanf("%d",&arr[i]);
    }
    for (int i=0;i<s;i++){
        printf("%d ",arr[i]);
    }
    int n;
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