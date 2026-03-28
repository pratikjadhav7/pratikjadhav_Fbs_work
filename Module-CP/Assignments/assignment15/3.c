#include<stdio.h>
#include<string.h>
typedef struct Player{
   char name[20];
   int noOfMatches,wkts,runs;
}Player;
void storePlayer(Player*,int);
void disPlayer(Player*,int);
void maxRuns(Player*,int);
void maxWkts(Player*,int);
int main(){
    Player arr[5];

    storePlayer(arr,5);

    disPlayer(arr,5);

    maxRuns(arr,5);
    maxWkts(arr,5);
}
void storePlayer(Player*arr,int size){
    for(int i=0;i<size;i++){
        printf("Player Name:");
        scanf("%s",arr[i].name);
        printf("Number Of Matches:");
        scanf("%d",&arr[i].noOfMatches);
        printf("Total Wickets:");
        scanf("%d",&arr[i].wkts);
        printf("Total Runs:");
        scanf("%d",&arr[i].runs);
    }
}
void disPlayer(Player*arr,int size){
         for(int i=0;i<size;i++){
        printf("\nPlayer Name:%s",arr[i].name);
        printf("\nNumber Of Matches:%d",arr[i].noOfMatches);
        printf("\nTotal Wickets:%d",arr[i].wkts);
        printf("\nTotal Runs:%d",arr[i].runs);
    }
}
void maxRuns(Player*arr,int size){
     Player max=arr[0];
     printf("\nPlayer With Maximun Runs:");
     for(int i=0;i<size;i++){
        if(max.runs<arr[i].runs){
        }
     }
     printf("Player Name:%s || Matches Played:%d",max.name,max.noOfMatches);
}
void maxWkts(Player*arr,int size){
     Player max=arr[0];
    printf("\nPLayer with Max Wickets:");
     for(int i=0;i<size;i++){
        if(max.wkts<arr[i].wkts){
        }
     }
     printf("Player Name:%s || Matches Played:%d",max.name,max.noOfMatches);
}