#include<stdio.h>
typedef struct Distance{
    int feet;
    float inch;
}Distance;
Distance storeDate();
void display(Distance);
int main(){
    Distance d1,d2;
    d1=storeDate();
    d2=storeDate();

    display(d1);
    display(d2);
}
Distance storeDate(){
    Distance d;
    printf("Enter feet:");
    scanf("%d",&d.feet);
    printf("Enter inch:");
    scanf("%f",&d.inch);

    return d;
}
void display(Distance d){
     printf("\nfeet:%d",d.feet);
     printf("\ninch:%f",d.inch);
}