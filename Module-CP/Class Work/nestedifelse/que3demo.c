#include<stdio.h>
int main()
{
  char ch;
  int digit;
  printf("Enter the value:");
  scanf("%c",&ch);
  scanf("%d",&digit);
  if(ch>='A'&& ch<='Z'){
    printf("%c is Uppercase",ch);
  }
  else{
    if(ch>='a' && ch<='z'){
          printf("%c is LOwercase",ch);
   }
   else{
    if(digit>=0 && digit<=9){
        printf("%d is digit",digit);
    }else{
        printf("Its a symbol");
    }
   }
  }


    
    
}