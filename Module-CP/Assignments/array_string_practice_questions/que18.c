#include<stdio.h>
#include<string.h>
int main(){
    char str1[100];
    printf("Enter String-1:");
    scanf("%s",str1);
    char str2[100];
    printf("Enter String-2:");
    scanf("%s",str2);
   int res= strcmp(str1,str2);
    if(res==0)
    printf("Both are equal");
else
    printf("Are not equal");
    
}