#include<stdio.h>
int isVowel(char);
int main(){
    char ch = 'b';
   int res= isVowel(ch);
   if(res==1)
   printf(" is vowel");
else
 printf(" is consonant");
  
}
int isVowel(char ch){
    if(ch=='a' || ch=='e' || ch=='i' || ch=='0' || ch=='u')
        return 1;
    else
        return 0;
    
}