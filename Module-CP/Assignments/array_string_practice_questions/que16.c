#include<stdio.h>
#include<string.h>
int main(){
    char str[100];
    printf("Enter String:");
    scanf("%s",str);
    int len=strlen(str);
    printf("LEngth of String Will be:%d",len);
}