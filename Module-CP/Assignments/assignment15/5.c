#include<stdio.h>
#include<string.h>
#define MAX 100
typedef struct Movie{
    int id;
   char title[20];
   char director[20];
   int releaseYr;
   char genre[20];
}Movie;
Movie m[MAX];
int count=0;

void addMovie(){
    printf("\n------ Enter Movie Details ------\n");

    printf("\nMovie ID:");
    scanf("%d",&m[count].id);
    printf("\nMovie Title:");
    scanf("%s",m[count].title);
    printf("\nMovie Release Year:");
    scanf("%d",&m[count].releaseYr);
    printf("\nMovie Genere:");
    scanf("%s",m[count].genre);

    printf("\n****** Movie Added Successfully ******\n");
    count++;
}

void searchFor(){
    int id;
    int found=0;
    printf("\nMovie ID:");
    scanf("%d",&id);

    for(int i=0;i<count;i++){
        if(id==m[i].id){
           found=1;
           printf("\nMovie Title:%s || Release Year:%d || Genere:%s",m[i].title,m[i].releaseYr,m[i].genre);
        }
    }
    if(found==0)
    printf("\nMovie Not found!");
}

void updateMovie(){
        int id;
    int found=0;
    printf("\nMovie ID:");
    scanf("%d",&id);

    for(int i=0;i<count;i++){
        if(id==m[i].id){
           found=1;
           printf("\nEnter New Title:");
           scanf("%s",m[i].title);
       
           printf("\nEnter New Genre:");
           scanf("%s",m[i].genre);
        }
    }
    if(found==0)
    printf("\nMovie Not found!");
}
int main(){
    int choice;

    do{
        printf("\n========= Movie Database ========");
        printf("\n1. Add Movie"); 
        printf("\n2. Search For...");
        printf("\n3. Update Movie Details");
        printf("\n4. Exit");

        printf("\nEnter choice:");
        scanf("%d",&choice);

        switch(choice){
            case 1:addMovie(); break;
            case 2:searchFor(); break;
            case 3:updateMovie(); break;
            case 4:printf("Exiting.....");
            default:printf("Invalid Choice"); 
        }
    }
    while(choice!=0);
}