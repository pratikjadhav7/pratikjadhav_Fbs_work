#include<stdio.h>
void isPalindrome();
int main(){
  isPalindrome();

}
void isPalindrome(){
       int num = 131;
    int temp = num;
    int reversed = 0;
    while(temp!=0){
        reversed = reversed*10 + (temp%10);
        temp/=10;
    }
    if(num==reversed){
        printf("%d is Plaindrome Num!",num);
    }else{
        printf("%d is not Plaindrome Num!",num);
    }
}