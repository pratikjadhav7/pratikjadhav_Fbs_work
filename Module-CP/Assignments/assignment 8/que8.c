#include<stdio.h>
int main(){
    int arr1[6]={12,34,56,3,2,1};
    int arr2[5]={12,56,23,45,56};
    int arr3[11];
    int s1=sizeof(arr1)/sizeof(int);
    int s2=sizeof(arr2)/sizeof(int);
    for(int i=0;i<s1;i++){
          arr3[i]=arr1[i];
          printf("%d ",arr3[i]);
    }
    for(int j=0;j<s2;j++){
        arr3[s1+j]=arr2[j];
         printf("%d ",arr3[s1+j]);
    }
}