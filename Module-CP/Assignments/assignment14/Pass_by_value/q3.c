#include<stdio.h>
typedef struct Admin{
     int id;
     char name[20];
     int salary;

}Admin;
Admin storeAdmin();
void display(Admin);
int main(){
    Admin a1,a2;
    a1=storeAdmin();
    printf("Details For Admin-1");
    display(a1);
    
    a2=storeAdmin();
    printf("\nDetails For Admin-2");
    display(a2);
}
Admin storeAdmin(){
    Admin b;
    printf("Enter ID:");
    scanf("%d",&b.id);
    printf("Enter Name:");
    scanf("%s",b.name);
    printf("Enter SAlary:");
    scanf("%d",&b.salary);

    return b;
}
void display(Admin b){
    printf("\nID:%d",b.id);
    printf("\nName:%s",b.name);
    printf("\nSalary:%d",b.salary);
}