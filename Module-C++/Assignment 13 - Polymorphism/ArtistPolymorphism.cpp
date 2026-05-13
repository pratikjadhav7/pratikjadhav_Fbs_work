#include<iostream>
using namespace std;

struct Artist{
    string name;
    int age;

    Artist(){
        this->name="not given";
        this->age=0;
    }
    Artist(string name,int age){
        this->name=name;
        this->age=age;
    }
   virtual void display(){
        cout<<"\nName: "<<this->name;
        cout<<"\nAge: "<<this->age;
    }
};

struct Painter :public Artist{
   string paintingStyle,mediumUsed;
   int noOfPaintings;

    Painter(){
    this->paintingStyle="Not Given";
    this->mediumUsed="Not given";
    this->noOfPaintings=00;
   }
   Painter(string name,int age,string style,string medium,int paintings):Artist( name,age){
    this->paintingStyle=style;
    this->mediumUsed=medium;
    this->noOfPaintings=paintings;
   }

   void display(){
    Artist::display();

    cout<<"\nPainting Style: "<<this->paintingStyle;
    cout<<"\nMedium Used: "<<this->mediumUsed;
    cout<<"\nNo Of Paintings: "<<this->noOfPaintings;
   }
};

struct Musician :public Artist{
    string instrument,musicGenre;
    int noOfAlbums;

    Musician(){
        this->instrument="Not Given";
        this->musicGenre="Not Given";
        this->noOfAlbums=00;
    }

    Musician(string name,int age,string instrument,string genere,int noOfAlbums):Artist(name,age){
        this->instrument=instrument;
        this->musicGenre=genere;
        this->noOfAlbums=noOfAlbums;
    }

    void display(){
        Artist::display();

        cout<<"\nInstrument: "<<this->instrument;
        cout<<"\nGenre: "<<this->musicGenre;
        cout<<"\nNum Of Albums: "<<this->noOfAlbums;
    }
};

int main(){
    Artist*at;
    Artist a1("Ajay",40);
    at=&a1;
    at->display();

    Painter p1("Pratik",24,"abc","qwer",40);
    at=&p1;
    at->display();

    Musician m1("Mahesh",30,"sdfg","zxcvbn",90);
    at=&m1;
    at->display();
}