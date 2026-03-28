#include<stdio.h>
#include<string.h>
int main(){
    char str[100];
    printf("Enter String:");
    scanf("%s",str);

    printf("Enter Char to replace it by special symbol:");
    char ch;
    scanf(" %c",&ch);

    for(int i=0;str[i]!='\0';i++){
         if(str[i]==ch){
            str[i]='$';
         }
    }
    printf("After Replacing Special Symbol:\n");
    printf("%s",str);
}