#include<stdio.h>
int main(){
    char ch = 'X';
    if(ch>='A' && ch<='Z'){
        printf("%c is Uppercase!",ch);
    }else{
        printf("%c is Lowercase!",ch);
    }
}