#include<stdio.h>
int isUpper();
int main(){
   int res=isUpper();
   if(res==1)
   printf("Uppercase!");
   else
    printf("Lowercase!");
   
}
int isUpper(){
     char ch = 'X';
    if(ch>='A' && ch<='Z'){
        return 1;
    }else{
        return 0;
    }
}