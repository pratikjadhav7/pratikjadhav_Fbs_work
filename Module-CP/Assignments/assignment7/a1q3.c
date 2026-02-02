#include<stdio.h>
void isVowel(char*ch);
int main(){
    char ch = 'b';
    isVowel(&ch);
  
}
void isVowel(char *ch){
    if(*ch=='a' || *ch=='e' || *ch=='i' || *ch=='0' || *ch=='u')
        printf("%c is vowel",*ch);
    else
        printf("%c is consonant",*ch);
    
}