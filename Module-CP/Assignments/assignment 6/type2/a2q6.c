#include<stdio.h>
int isDivisible();
int main(){
    int res=isDivisible();
    if(res==1)
    printf("Number is Divisible by both");
    if(res==2)
    printf(" Divisible by 3 not 5");
    if(res==3)
    printf("Divisible by 5 not 3");
    if(res==4)
    printf("Not Divisible by both");

}
int isDivisible(){
        int num;
    printf("Enter the Number:");
    scanf("%d",&num);
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
                return 4;
            }
        }
    }
}
