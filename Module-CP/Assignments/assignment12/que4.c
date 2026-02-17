#include <stdio.h>
#include <string.h>

int main(){
    char str[100], newstr[100];
    printf("Enter a string: ");
    fgets(str,sizeof(str),stdin);
    int len = strlen(str);
    strcpy(newstr, str);
    newstr[0] = str[len-1];
    newstr[len-1] = str[0];  
    printf("New string: %s",newstr);
}
