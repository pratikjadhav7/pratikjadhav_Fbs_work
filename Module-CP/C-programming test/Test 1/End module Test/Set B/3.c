#include<stdio.h>
#include<string.h>
#define MAX 100
typedef struct Song{
   int id;
   char title[20];
   char art[20];
   float duration;
}Song;
Song s[MAX];
int count=0;
void addSong(){
    printf("\n------ Enter Song Details ------\n");
    printf("\nSong ID:");
    scanf("%d",&s[count].id);
    printf("\nSong Title:");
    scanf("%s",s[count].title);
    printf("\nSong Artist:");
    scanf("%s",s[count].art);
    printf("\nSong Duration:");
    scanf("%f",&s[count].duration);

    printf("\n***** Song Added Successfully ******\n");
    count++;
}

void displayLibrary(){
    for(int i=0;i<count;i++){
        printf("\nID : %d || Title : %s || Artist : %s || Duration : %f\n",s[i].id,s[i].title,s[i].art,s[i].duration);
    }
}
int main(){
    int choice;

    do{
        printf("\n======= MUSIC LIBRARY ========\n");
        printf("\n1. Add Song");
        printf("\n2.Display Song Library");
        printf("\n3. Exiting...");
        printf("\nEnter Choice:");
        scanf("%d",&choice);


        switch (choice) {
           case 1:addSong(); break;
           case 2:displayLibrary(); break;
           case 3:printf("Exiting.....");
           default:printf("Invalid Choice");
        }
     }
     while(choice!=0);
}