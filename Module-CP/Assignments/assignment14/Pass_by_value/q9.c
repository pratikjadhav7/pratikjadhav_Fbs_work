#include<stdio.h>
typedef struct Complex{
    int real;
    int imag;
}Complex;
Complex storeDate();
void display(Complex);
int main(){
    Complex c1,c2;
    c1=storeDate();
    c2=storeDate();
    printf("Compex Num-1:");
    display(c1);
    printf("\nCompex Num-2:");
    display(c2);
}
Complex storeDate(){
    Complex c;
    printf("Enter real:");
    scanf("%d",&c.real);
    printf("Enter imag:");
    scanf("%d",&c.imag);

    return c;
}
void display(Complex c){
     printf("\n%d + %di",c.real,c.imag);
}