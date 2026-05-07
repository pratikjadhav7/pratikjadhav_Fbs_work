#include<iostream>
using namespace std;

struct Player{
    string name,country;
    int age,matchesPlayed,jNum;

    Player(){
        this->name="not given";
        this->country="not given";
        this->age=0;
        this->matchesPlayed=0;
        this->jNum=0;
    }
    Player(string name,string country,int age,int matchesPlayed,int jNum){
        this->name=name;
        this->country=country;
        this->age=age;
        this->matchesPlayed=matchesPlayed;
        this->jNum=jNum;
    }

    void display(){
        cout<<"\nName: "<<this->name;
        cout<<"\nJersey Number: "<<this->jNum;
        cout<<"\nMatches: "<<this->matchesPlayed;
        cout<<"\nCountry: "<<this->country;
        cout<<"\nAge: "<<this->age;
    }
};

struct CricketPlayer :public Player{
    int totalRuns,totalWkts;
    string battingStyle,bowlingStyle;

    CricketPlayer(){
        this->totalRuns=00;
        this->totalWkts=00;
        this->battingStyle="Not given";
        this->bowlingStyle="Not given";
    }

    CricketPlayer(string name,string country,int age,int matchesPlayed,int jNum,int runs,int wkts,string battingStyle,string bowlingStyle)
    :Player(name,country,age,matchesPlayed,jNum){
        this->totalRuns=runs;
        this->totalWkts=wkts;
        this->battingStyle=battingStyle;
        this->bowlingStyle=bowlingStyle;
    }

    void display(){
        Player::display();

        cout<<"\nTotal Runs: "<<this->totalRuns;
        cout<<"\nTotal Wkts: "<<this->totalWkts;
        cout<<"\nBatting Style: "<<this->battingStyle;
        cout<<"\nBowling Style: "<<this->bowlingStyle;
    }
};
struct FootballPlayer :public Player{
    int totalGoals;
    string playingPos;

    FootballPlayer(){
        this->totalGoals=00;
        this->playingPos="Not Given";
    }

    FootballPlayer(string name,string country,int age,int matchesPlayed,int jNum,int goals,string pos)
    :Player(name,country,age,matchesPlayed,jNum){
        this->totalGoals=goals;
        this->playingPos=pos;
    }

    void display(){
        Player::display();

        cout<<"\nTotal Goals: "<<this->totalGoals;
        cout<<"\nPlaying Position: "<<this->playingPos;
    }
};

int main(){
    Player p1("Pratik","Indian",40,150,7);
    p1.display();

    CricketPlayer c1("MSD","INdia",40,150,7,4000,21,"Right","right");
    c1.display();

    FootballPlayer f1("Ronaldo","portugal",38,150,7,500,"Corner");
    f1.display();

}