// Base Class
class Artist {
     String artistName;

    Artist(String artistName) {
        this.artistName = artistName;
    }

     String getArtistName() {
        return artistName;
    }
}

// Painter Class
class Painter extends Artist {
     String paintingStyle;

     Painter(String artistName, String paintingStyle) {
        super(artistName);
        this.paintingStyle = paintingStyle;
    }

     String getPaintingStyle() {
        return paintingStyle;
    }
}

// Musician Class
class Musician extends Artist {
     String instrument;

     Musician(String artistName, String instrument) {
        super(artistName);
        this.instrument = instrument;
    }

     String getInstrument() {
        return instrument;
    }
}

// Actor Class
class Actor extends Artist {
     String movieType;

     Actor(String artistName, String movieType) {
        super(artistName);
        this.movieType = movieType;
    }

     String getMovieType() {
        return movieType;
    }
}

// Main Class
public class CulturalFest  {

    // Method to check eligibility
    public static void checkMusicEventEligibility(Artist artist) {

        // RTTI using instanceof
        if (artist instanceof Musician) {

            // Downcasting
            Musician musician = (Musician) artist;

            System.out.println(
                "Musician " + musician.getArtistName()
                + " is allowed for the Music Event and is playing "
                + musician.getInstrument() + "."
            );

        } else {

            System.out.println(
                artist.getArtistName()
                + " is not allowed for the Music Event."
            );
        }
    }

    public static void main(String[] args) {

        // Artist array
        Artist[] artists = {
            new Painter("Rahul", "Oil Painting"),
            new Musician("Aman", "Guitar"),
            new Actor("Riya", "Drama"),
            new Musician("Sneha", "Violin")
        };

        // Iterate through array
        for (Artist artist : artists) {
            checkMusicEventEligibility(artist);
        }
    }
}