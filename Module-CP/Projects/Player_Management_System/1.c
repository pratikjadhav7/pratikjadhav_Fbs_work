#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define MAX 100
typedef struct Player{
      int JersyNum,runs,wkts,matchesPlayed;
      char name[20];
}Player;
Player *p;
int count =0;
int capacity=2;
void addPlayer(){

    if(count>=capacity){
        capacity=capacity*2;
        p=(Player*)realloc(p,capacity*sizeof(Player));

        if(p==NULL){
            printf("Memory Allocation Fail!\n");
        }
    }
    printf("\n-------- Enter Player Details ---------\n");
    printf("Player Name:");
    scanf("%s",p[count].name);
    printf("Player Jersey Number:");
    scanf("%d",&p[count].JersyNum);
    printf("Enter Runs:");
    scanf("%d",&p[count].runs);
    printf("Enter Wickets:");
    scanf("%d",&p[count].wkts);
    printf("Enter Number Of Matches Played:");
    scanf("%d",&p[count].matchesPlayed);

    printf("******** PLAYER ADDED SUCCESSFULLY ********");
    count++;
}
void searchByName(){
    char name[20];
    int found=0;
    printf("Player Name:");
    scanf("%s",name);
    
    for(int i=0;i<count;i++){
        if(strcmp(p[i].name,name)==0){
          found=1;
          printf("%s :- Jersey Num = %d | Total Runs = %d | Total Wkts = %d | Matches Played = %d",p[i].name,p[i].JersyNum,p[i].runs,p[i].wkts,p[i].matchesPlayed);
        }
    }
    if(found==0)
    printf("\n----- PLayer Not Found ------\n");
}
void searchByJersey(){
    int jNo;
    int found=0;
    printf("Enter Jersey Num:");
    scanf("%d",&jNo);

    for(int i=0;i<count;i++){
        if(jNo==p[i].JersyNum){
        found=1;
        printf("%d :- Player = %s | Total Runs = %d | Total Wkts = %d | Matches Played = %d",p[i].JersyNum,p[i].name,p[i].runs,p[i].wkts,p[i].matchesPlayed);
    }
  }
    if(found==0)
    printf("------ PLayer Not Found -------");
}
void updatePlayer(){
    char name[20];
    printf("Player Name:");
    scanf("%s",name);
    
    for(int i=0;i<count;i++){
        if(strcmp(p[i].name,name)==0){
          printf("Enter Runs:");
          scanf("%d",&p[i].runs);
          printf("Enter Wickets:");
          scanf("%d",&p[i].wkts);
          printf("Matches Played:");
          scanf("%d",&p[i].matchesPlayed);
         
          printf("****** Updated Successfully *******");
        }else{
            printf("------- Player Not Found ------");
        }
    }
}
void sortByRuns(){
    for(int i=0;i<count;i++){
        for(int j=0;j<count-1;j++){
            if(p[j].runs<p[j+1].runs){
                Player temp=p[j];
                p[j]=p[j+1];
                p[j+1]=temp;
            }
        }
    }
    printf("\n***** Sorted By Runs *****\n");
    for(int i=0;i<count;i++){
        printf("%s (%d)\n8",p[i].name,p[i].runs);
    }
}
void sortByWkts(){
    for(int i=0;i<count;i++){
        for(int j=0;j<count-1;j++){
            if(p[j].wkts<p[j+1].wkts){
                Player temp=p[j];
                p[j]=p[j+1];
                p[j+1]=temp;
            }
        }
    }
    printf("\n***** Sorted By Wickets *****\n");
    for(int i=0;i<count;i++){
        printf("%s (%d)\n",p[i].name,p[i].wkts);
    }
}
void removePlayer(){
    char name[20];
    printf("Enter Player Name to delete:");
    scanf("%s",name);

    for(int i=0;i<count;i++){
        if(strcmp(p[i].name,name)==0){
            for(int j=i;j<count-1;j++){
                p[j]=p[j+1];
            }
            count--;
            printf("****** Player Deleted Successfully *******");
        }else{
             printf("------- Player Not Found -------");
        }
    }
}
void displayAll(){
    printf("\n-------All Players Details -------\n");
     for(int i=0;i<count;i++){
     printf("\nPLayer = %s || Jersey Number = %d || Total Runs = %d  || Total Wkts = %d  || Matches Played = %d\n",p[i].name,p[i].JersyNum,p[i].runs,p[i].wkts,p[i].matchesPlayed);
    } 
} 
int main(){
    int choice;
      p=(Player*)malloc(capacity*sizeof(Player));

        if(p==NULL){
            printf("Memory Allocation Fail!\n");
        }

    do{
        printf("\n============ PLAYER MANAGEMENT SYSTEM ===========\n");
        printf("\n1. Add Player");
        printf("\n2. Search By Name");
        printf("\n3. Search By Jersey Number");
        printf("\n4. Update Players Data");
        printf("\n5. Sort by Most Runs");
        printf("\n6. Sort by Most Wickets");
        printf("\n7. Remove PLayer");
        printf("\n8. Display All PLayers");
        printf("\n9. Exit");
        printf("\nEnter Choice:");
        scanf("\n%d",&choice);

        switch(choice){
            case 1:addPlayer(); break;
            case 2:searchByName(); break;
            case 3:searchByJersey(); break;
            case 4:updatePlayer(); break;
            case 5:sortByRuns(); break;
            case 6:sortByWkts(); break;
            case 7:removePlayer(); break;
            case 8:displayAll(); break;
            case 9:printf("\n******* EXITING *******\n");
            default:printf("Invalid Choice");

        }
    }
        while(choice!=0);  
        free(p);
}
