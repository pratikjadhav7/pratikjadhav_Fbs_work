#include<stdio.h>
#include<string.h>
int main(){
 char str[100];
 int count=0;
 printf("Enter String:");
 fgets(str,sizeof(str),stdin);
 for(int i=0;str[i]!='\0';i++){
    if(strchr("AEIOUaeiou",str[i])!=NULL){
        count++;
    }
 }
     printf("Number of vowels = %d", count);
}