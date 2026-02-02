#include<stdio.h>
int  isPalindrome();
int main(){
 int res= isPalindrome();
 if(res==1)
 printf("NUmber is Plaindrome Num!");
else
 printf("NUmber is not Plaindrome Num!");

}
int isPalindrome(){
    int num = 131;
    int temp = num;
    int reversed = 0;
    while(temp!=0){
        reversed = reversed*10 + (temp%10);
        temp/=10;
    }
    if(num==reversed)
        return 1;
    else
        return 0; 
       
}