#include<stdio.h>
typedef struct Employee{
    int id,salary;
    char name[20];
}Employee;
void storeEmployee(Employee*,int);
void displayEmployee(Employee*,int);
int main(){
    Employee arr[5];
    Employee brr[10];

    storeEmployee(arr,5);
    displayEmployee(arr,5);
    storeEmployee(brr,5);
    displayEmployee(brr,5);
}
void storeEmployee(Employee*arr,int s){
    printf("Enter Employee Details:");
      for(int i=0;i<s;i++){
        scanf("%d",&arr[i].id);
        scanf("%d",&arr[i].salary);
        scanf("%s",arr[i].name);
      }
}
void displayEmployee(Employee*arr,int s){
    printf("-----Employee Details:---------");
      for(int i=0;i<s;i++){
        printf("ID = %d",arr[i].id);
        printf("Salary = %d",arr[i].salary);
        printf("Name = %s",arr[i].name);
      }
}