#include<stdio.h>
typedef struct Employee{
    int id;
    char name[20];
    int salary;
}Employee;
Employee storeEmployee();
void display(Employee);
int main(){
    Employee e1,e2;
    e1=storeEmployee();
    e2=storeEmployee();

    printf("Details For Employee-1");
    display(e1);
    printf("\nDetails For Employee-2");
    display(e2);
}
Employee storeEmployee(){
      Employee e;
      printf("Enter ID:");
      scanf("%d",&e.id);
      printf("Enter Name:");
      scanf("%s",e.name);
      printf("Enter Salary:");
      scanf("%d",&e.salary);

      return e;
}
void display(Employee e){
    printf("\nEmployee Id:%d",e.id);
    printf("\nEmployee Name:%s",e.name);
    printf("\nEmployee Salary:%d",e.salary);
}