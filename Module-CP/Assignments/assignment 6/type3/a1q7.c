#include<stdio.h>
int isDis(int);
int main(){
    int salary=5000;
    float res=isDis(salary);
    printf("%f",res);
    return 0;
}
int isDis(int salary){
    float da,ta,rha,total;
    if(salary<=5000){
        da=(10.0/100)*salary;
        ta=(20.0/100)*salary;
        rha=(25.0/100)*salary;
}else{
        da=(15.0/100)*salary;
        ta=(25.0/100)*salary;
        rha=(30.0/100)*salary;

}
total=da+ta+rha;
printf("da is %f\n",da);
printf("ta is %f\n",ta);
printf("rha is %f\n",rha);
printf("Total will be: %f",total);
return total;
 
}