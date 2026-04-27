
class Artist {

    String name;
    int age;

    public Artist() {
        this.name = "Not Given";
        this.age = 0;
    }

    public Artist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    String getName() {
        return this.name;
    }

    int setAge() {
        return this.age;
    }

    void display() {
        System.out.println("Artist Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

}

class Painter extends Artist {

    String paintingStyle, mediumUsed;
    int numberOfPaintings;

    public Painter() {
        super();
        this.paintingStyle = "Not given";
        this.mediumUsed = "Not given";
        this.numberOfPaintings = 00;
    }

    public Painter(String name, int age, String paintingStyle, String mediumUsed, int numberOfPaintings) {
        super(name, age);
        this.paintingStyle = paintingStyle;
        this.mediumUsed = mediumUsed;
        this.numberOfPaintings = numberOfPaintings;
    }

    void setPaintingStyle(String style) {
        this.paintingStyle = style;
    }

    void setMediumUsed(String mediumUsed) {
        this.mediumUsed = mediumUsed;
    }

    void setNumberOfPaintings(int paintings) {
        this.numberOfPaintings = paintings;
    }

    String getPaintingStyle() {
        return this.paintingStyle;
    }

    String getMediumUsed() {
        return this.mediumUsed;
    }

    int getNumberOfPaintings() {
        return this.numberOfPaintings;
    }

    void display() {
        super.display();
        System.out.println("Painting Style: " + paintingStyle);
        System.out.println("Medium Used: " + mediumUsed);
        System.out.println("Number Of Paintings: " + numberOfPaintings);
    }

}

class Musician extends Artist {

    String instrument, musicGenre;
    int numberOfAlbums;

    public Musician() {
        this.instrument = "Not Given";
        this.musicGenre = "Not Given";
        this.numberOfAlbums = 00;
    }

    public Musician(String instrument, String musicGenre, int numberOfAlbums, String name, int age) {
        super(name, age);
        this.instrument = instrument;
        this.musicGenre = musicGenre;
        this.numberOfAlbums = numberOfAlbums;
    }

    void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    void setMusicGenere(String genere) {
        this.musicGenre = genere;
    }

    void setNumberOfAlbums(int noOfAlbums) {
        this.numberOfAlbums = noOfAlbums;
    }

    String getInstrument() {
        return this.instrument;
    }

    String getMusicGenere() {
        return this.musicGenre;
    }

    int getNumberOfAlbums() {
        return this.numberOfAlbums;
    }

    void display() {
        super.display();
        System.out.println("Instrument: " + instrument);
        System.out.println("Genere: " + musicGenre);
        System.out.println("Number Of Albums: " + numberOfAlbums);
    }
}

class Actor extends Artist {

    String filmIndustry;
    int numberOfMovies;

    public Actor() {
        this.filmIndustry = "Not Given";
        this.numberOfMovies = 00;
    }

    public Actor(String filmIndustry, int numberOfMovies, String name, int age) {
        super(name, age);
        this.filmIndustry = filmIndustry;
        this.numberOfMovies = numberOfMovies;
    }

    void setFilmIndustry(String filmIndustry) {
        this.filmIndustry = filmIndustry;
    }

    void setNumberOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    String setFilmIndustry() {
        return this.filmIndustry;
    }

    int setNumberOfMovies() {
        return this.numberOfMovies;
    }

    void display(){
        super.display();
        System.out.println("Film Industry: "+filmIndustry);
        System.out.println("Number Of Movies: "+numberOfMovies);
    }
}

public class ArtistPolymorphism {

    public static void main(String[] args) {

        Artist a = new Artist();
        a =new Painter("Pratik",21,"xyz","abc",17);
       a.display();

       System.out.println("");

       a = new Musician("Gutior","pqr",12,"Mahesh",23);
       a.display();

       System.out.println("");
       
       a = new Actor("kmn",53,"lmn",30);
       a.display();
    }
}
