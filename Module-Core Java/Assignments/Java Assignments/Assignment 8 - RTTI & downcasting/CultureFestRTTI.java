class Artist{
    String name;

    Artist(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}

class Painter extends Artist{
    String paintingStyle;

    Painter(String name,String paintingStyle){
        super(name);
        this.paintingStyle=paintingStyle;
    }

    String getPaintingStyle(){
        return this.paintingStyle;
    }
}

class Musician extends Artist{
    String instrument;

    public Musician(String instrument, String name) {
        super(name);
        this.instrument = instrument;
    }

    String getInstrument(){
        return this.instrument;
    }
}

class Actor extends Artist{
    String movie;

    public Actor(String movie, String name) {
        super(name);
        this.movie = movie;
    }

    String getMovie(){
        return this.movie;
    }
}
public class CultureFestRTTI{
    public static void checkMusicEventEligibility(Artist artist){

        if(artist instanceof Musician){

            Musician musician = (Musician) artist;

            System.out.println("Musician "+ musician.getName()+" is allowed for the Music Event and is Playing "+musician.getInstrument());
        }else{
            System.out.println("Musician is not Allowed for Music Event.");
        }
    }
    public static void main(String args[]){

        Artist[] artists={
            new Painter("Pratik","asdfedfgh"),
            new Musician("Guitor","Snehal"),
            new Actor("MSD The Untold Story","Sushant Rajput"),
            new Musician("Violene","Pratik")
        };

        for(Artist artist:artists){
            checkMusicEventEligibility(artist);
        }
    }
}