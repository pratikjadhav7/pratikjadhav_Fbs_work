#include<stdio.h>
#include<string.h>
int main(){
    char str1[100];
    printf("Enter String-1:");
    scanf("%s",str1);
    int len=strlen(str1);
    int start=0;
    int end=len-1;
    while(start<end){
        char temp=str1[start];
        str1[start]=str1[end];
        str1[end]=temp;

        start++;
        end--;
    }
    printf("Reversed String:");
        printf("%s",str1);
}