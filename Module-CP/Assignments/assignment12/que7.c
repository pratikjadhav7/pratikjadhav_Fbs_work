#include<stdio.h>
#include<string.h>
int main(){
    char str[100];
    printf("Enter String:");
    fgets(str,sizeof(str),stdin);
    printf("Odd index characters: ");
    for(int i=0;str[i]!='\0';i+=2){
          printf("%c",str[i]);
    }
}