#include<stdio.h>
void isUpper();
int main(){
    isUpper();
   
}
void isUpper(){
     char ch = 'X';
    if(ch>='A' && ch<='Z'){
        printf("%c is Uppercase!",ch);
    }else{
        printf("%c is Lowercase!",ch);
    }
}