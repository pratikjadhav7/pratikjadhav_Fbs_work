#include<stdio.h>
int isPalindrome(int,int,int);
int main(){
int num = 131;
int temp = num;
int reversed = 0;
int res=isPalindrome(num,temp,reversed);
if(res==1)
printf(" Plaindrome Num!");
else
 printf("not Plaindrome Num!");

}
int isPalindrome(int a,int b,int c){

    while(b!=0){
        c= c*10 + (b%10);
        b/=10;
    }
    if(a==c){
        return 1;
    }else{
        return 0;
    }
}