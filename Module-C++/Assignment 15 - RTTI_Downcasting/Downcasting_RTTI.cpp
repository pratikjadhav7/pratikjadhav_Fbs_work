#include<iostream>
using namespace std;

class Artist{
public:
    string name;
    int age;

    Artist(string name,int age){
        this->name=name;
        this->age=age;
    }

    void setName(string name){
        this->name=name;
    }

    string getName(){
        return this->name;
    }
     void setAge(int age){
        this->age=age;
    }

    int getAge(){
        return this->age;
    }
    virtual ~Artist(){} 
};

class Painter :public Artist{
 public:
    string paintingStyle,mediumUsed;

    Painter(string name,int age,string style,string medium):Artist(name,age){
        this->paintingStyle=style;
        this->mediumUsed=medium;
    }

    void setStyle(string style){
        this->paintingStyle=style;
    }

    void setMedium(string medium){
        this->mediumUsed=medium;
    }

    string getStyle(){
        return this->paintingStyle;
    }

    string getMedium(){
        return this->mediumUsed;
    }

};

class Musician :public Artist{
public:
    string instrument;
 
    Musician(string name,int age,string instrument):Artist(name,age){
        this->instrument=instrument;
    }

    void setInstrument(string instrument){
        this->instrument=instrument;
    }

    string getInstrument(){
      return this->instrument;
    }

};

class Actor :public Artist{
    string movie;
public:
    Actor(string name,int age,string movie):Artist(name,age){
        this->movie=movie;
    }
};

static void checkMusicEventEligibility(Artist* artist){

    Musician*musician = dynamic_cast<Musician*>(artist);
        if(musician!=0){
            cout<<"\n"<<"Musician "<<musician->getName()<< " is allowed for the Music Event and is playing" <<musician->getInstrument();
        }else{
            cout<<"\nNot Allowed For Music Event.";
        }
};
int main(){
      Artist* artist[]={
      new Painter ("Mahesh",23,"asdf","qwert"),
      new Musician ("Pratik",22,"Piano"),
      new Actor ("Chetan",30,"ChetanSpeaks"),
      new Musician("Snehal",21,"Gutior")
      };

          for (int i = 0; i < 4; i++) {
        checkMusicEventEligibility(artist[i]);
    }
}