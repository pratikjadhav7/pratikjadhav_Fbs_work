#include<stdio.h>
int isUpper(char);
int main(){
    char ch = 'X';
   int res= isUpper(ch);
   if(res==1)
   printf("is Uppercase!");
   else
   printf("is Lowercase!");
}
int isUpper(char ch){
    if(ch>='A' && ch<='Z'){
        return 1;
    }else{
        return 0;
    }
}