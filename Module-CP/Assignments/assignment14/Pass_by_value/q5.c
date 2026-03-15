#include<stdio.h>
typedef struct salesManager{
    int id;
    char name[20];
    int salary;
    float commision;
    int incentive;
    int target;

}salesManager;
salesManager storeHR();
void display(salesManager);
int main(){
    salesManager h1,h2;

    h1=storeHR();
    h2=storeHR();
    
    printf("Details for HR-1:");
    display(h1);
    printf("Details for HR-2:");
    display(h2);
}
salesManager storeHR(){
    salesManager sm;

    printf("Enter ID:");
    scanf("%d",&sm.id);
    printf("Enter Name:");
    scanf("%s",sm.name);
    printf("Enter Salary:");
    scanf("%d",&sm.salary);
    printf("Enter Commision:");
    scanf("%f",&sm.commision);
    printf("Enter Incentive:");
    scanf("%d",&sm.incentive);
    printf("Enter Target:");
    scanf("%d",&sm.target);

    return sm;

}
void display(salesManager sm){
    printf("\nID:%d",sm.id);
    printf("\nName:%s",sm.name);
    printf("\nSalary:%d",sm.salary);
    printf("\nCommision:%f",sm.commision);
    printf("\nIncentive:%d",sm.incentive);
    printf("\nTarget:%d",sm.target);

}