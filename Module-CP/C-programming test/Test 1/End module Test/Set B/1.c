#include<stdio.h>
#include<string.h>
int main(){
    char str[100];
    int count=0;
    printf("Enter String:");
    fgets(str,sizeof(str),stdin);

    for(int i=0;str[i]!='\0'&& str[i]!='\n';i++){
        if(str[i]==' '){
            count++;
        }
    }
    printf("\n Number Of Words in String:%d",count+1);
}