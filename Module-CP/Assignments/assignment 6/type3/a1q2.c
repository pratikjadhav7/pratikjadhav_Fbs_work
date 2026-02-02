#include<stdio.h>
void isPalindrome(int,int,int);
int main(){
int num = 131;
int temp = num;
int reversed = 0;
isPalindrome(num,temp,reversed);

}
void isPalindrome(int a,int b,int c){

    while(b!=0){
        c= c*10 + (b%10);
        b/=10;
    }
    if(a==c){
        printf("%d is Plaindrome Num!",a);
    }else{
        printf("%d is not Plaindrome Num!",a);
    }
}