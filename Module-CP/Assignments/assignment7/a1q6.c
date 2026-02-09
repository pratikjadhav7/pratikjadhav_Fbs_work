#include<stdio.h>
void isUpper(char*ch);
int main(){
     char ch = 'X';
    isUpper(&ch);
   
}
void isUpper(char*ch){
    if(*ch>='A' && *ch<='Z'){
        printf("%c is Uppercase!",*ch);
    }else{
        printf("%c is Lowercase!",*ch);
    }
}