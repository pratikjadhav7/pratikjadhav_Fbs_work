#include<stdio.h>
typedef struct Admin{
    int id,salary;
    char name[20];
}Admin;
void storeAdmin(Admin*,int);
void displayAdmin(Admin*,int);
int main(){
    Admin arr[5];
    Admin brr[10];

    storeAdmin(arr,5);
    displayAdmin(arr,5);
    storeAdmin(brr,5);
    displayAdmin(brr,5);
}
void storeAdmin(Admin*arr,int s){
    printf("Enter Admin Details:");
      for(int i=0;i<s;i++){
        printf("Enter ID:");
        scanf("%d",&arr[i].id);
        printf("Enter salary:");
        scanf("%d",&arr[i].salary);
        printf("Enter Name:");
        scanf("%s",arr[i].name);
      }
}
void displayAdmin(Admin*arr,int s){
    printf("-----Admin Details:---------");
      for(int i=0;i<s;i++){
        printf("ID = %d",arr[i].id);
        printf("Salary = %d",arr[i].salary);
        printf("Name = %s",arr[i].name);
      }
    }
