#include<stdio.h>
#include<string.h>
int main(){
    char str[100];
    char ch;
    int found=0;
    printf("Enter String:");
    scanf("%s",str);
    printf("Enter char to find in String:");
    scanf(" %c",&ch);
    for(int i=0;str[i]!='\0';i++){
          if(str[i]==ch){
            found=1;
            break;
          }
    }
        if(found)
        printf("Found");
        else
        printf("Not Found");
}