#include<stdio.h>
typedef struct Complex{
   int real;
   int imag;
}Complex;
void storeComplex(Complex*,int);
void displayComplex(Complex*,int);
int main(){
    Complex arr[5];

    storeComplex(arr,5);
    displayComplex(arr,5);
}
void storeComplex(Complex*arr,int size){
    printf("Enter Real And Imaginary Part:\n");
    for(int i=0;i<size;i++){
        printf("Enter Real Part:");
        scanf("%d",&arr[i].real);
        printf("Enter Real imag:");
        scanf("%d",&arr[i].imag);
    }
}
void displayComplex(Complex*arr,int size){
        for(int i=0;i<size;i++){
        printf("\nComplex Number = %d+%di",arr[i].real,arr[i].imag);
        }
    }