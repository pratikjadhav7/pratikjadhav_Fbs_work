#include<stdio.h>
void isVowel();
int main(){
    isVowel();
  
}
void isVowel(){
      char ch = 'b';
    if(ch=='a' || ch=='e' || ch=='i' || ch=='0' || ch=='u'){
        printf("%c is vowel",ch);
    }else{
        printf("%c is consonant",ch);
    }
}