#include<stdio.h>
typedef struct HR{
    int id;
    char name[20];
    int salary;
    float commision;

}HR;
HR storeHR();
void display(HR);
int main(){
    HR h1,h2;

    h1=storeHR();
    h2=storeHR();
    
    printf("Details for HR-1:");
    display(h1);
    printf("Details for HR-2:");
    display(h2);
}
HR storeHR(){
    HR hr;

    printf("Enter ID:");
    scanf("%d",&hr.id);
    printf("Enter Name:");
    scanf("%s",hr.name);
    printf("Enter Salary:");
    scanf("%d",&hr.salary);
    printf("Enter Commision:");
    scanf("%f",&hr.commision);

    return hr;

}
void display(HR hr){
    printf("\nID:%d",hr.id);
    printf("\nName:%s",hr.name);
    printf("\nSalary:%d",hr.salary);
    printf("\nCommision:%f",hr.commision);
}