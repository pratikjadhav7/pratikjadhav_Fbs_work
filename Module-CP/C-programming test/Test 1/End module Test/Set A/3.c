#include<stdio.h>
#include<string.h>
#define MAX 100
typedef struct Task{
    int id;
    char disc[100];
    char status[20];
}Task;
Task t[MAX];
int count=0;

void addTask(){
    printf("\n-------- Add Task ---------\n");

    printf("Task ID:");
    scanf("%d",&t[count].id);
    printf("\nEnter Discription:");
    scanf("%s",t[count].disc);
    printf("\nStatus: (Completed/Ongoing/Cancled/Upcoming):");
    scanf("%s",t[count].status);

    printf("\n***** Task Added Successfully *****\n");
    count++;
}

void updateTask(){
    int id;
    int found=0;
    printf("Enter Task ID:");
    scanf("%d",&id);

    for(int i=0;i<count;i++){
        if(t[i].id==id){
           found=1;
           printf("Enter New Discription:");
           scanf("%s",t[i].disc);
           printf("Enter Updated Status:");
           scanf("%s",t[i].status);

           printf("***** Uptaded Successfully ****");
        }
    }
    if(found==0)
    printf("Task Not Found!");
}

void displayTask(){
    for(int i=0;i<count;i++){
        printf("\nTask ID : %d || Discription : %s || Status : %s\n",t[i].id,t[i].disc,t[i].status);
    }
}
int main(){
    int choice;

    do{
        printf("====== TASK DETAILS MANAGEMANT ======");
        printf("\n1. Add Task");
        printf("\n2. Update Task");
        printf("\n3. Display Task");
        printf("\n4. Exit");

        printf("\nEnter Choice:");
        scanf("%d",&choice);

        switch (choice) {
            case 1:addTask(); break;
            case 2:updateTask(); break;
            case 3:displayTask(); break;
            case 4:printf("Exiting....");
            default:printf("Invalid Choice");
        
        }
    }
    while(choice!=0);
}