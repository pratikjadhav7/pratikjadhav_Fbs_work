#include<stdio.h>
int isDivisible(int);
int main(){
    int num;
    printf("Enter the Number:");
    scanf("%d",&num);
    int res=isDivisible(num);
    if(res==1)
    printf("num is divisible by both.");
    else if(res==2)
      printf("num is divisible by 3 not 5.");
    else if(res==3)
      printf("num is divisible by 5 not 3.");
    else
     printf("num Divisible by none.");

}
int isDivisible(int num){
    if(num%3==0 && num%5==0){
       return 1;
    }
    else{
        if(num%3==0 && num%5!=0){
          return 2;
        }else{
            if(num%5==0 && num%3!=0){
              return 3;
            }else{
               return 0;
            }
        }
    }
}
