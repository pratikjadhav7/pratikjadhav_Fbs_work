#include<stdio.h>
int main(){
    int basic=5500;
    float da,ta,rha,total;
    if(basic<=5000){
        da = 0.10*basic;
        ta = 0.20*basic;
        rha =0.25*basic;
    }else{
        da = 0.15*basic;
        ta = 0.25*basic;
        rha =0.30*basic;

    }
    total = da+ta+rha;
    printf("total : %f",total);
}
