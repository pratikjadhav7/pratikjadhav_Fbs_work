#include<stdio.h>
#include<string.h>
int main(){
    char str[100];
    int index;
    printf("Enter String:");
    fgets(str,sizeof(str),stdin);
    printf("Enter the index to remove character:");
    scanf("%d",&index);
    for(int i=index;str[i]!='\0';i++){
            str[i]=str[i+1];
    }
    printf("After removing the character:\n");
    printf("%s",str);
}