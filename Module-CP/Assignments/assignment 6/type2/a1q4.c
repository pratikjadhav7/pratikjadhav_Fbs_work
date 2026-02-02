#include<stdio.h>
int isVowel();
int main(){
   int res= isVowel();
   if(res==1)
    printf("vowel");
else
 printf("Consonant");
  
}
int isVowel(){
      char ch = 'b';
    if(ch=='a' || ch=='e' || ch=='i' || ch=='0' || ch=='u')
    return 1;
    else
    return 0;
    
}