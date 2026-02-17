#include<stdio.h>
#include<string.h>
int main(){
    char str[100];
    printf("Enter String:");
    fgets(str,sizeof(str),stdin);
    for(int i=0;str[i]!='\0';i++){
        if(str[i]=='a'){
            str[i]='$';
        }
    }
    printf("After replacing $ at 'a':\n");
    printf("%s",str);
}