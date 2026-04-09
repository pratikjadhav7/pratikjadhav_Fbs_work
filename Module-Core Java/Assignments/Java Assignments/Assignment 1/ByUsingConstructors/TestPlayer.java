
class Player {

    String name;
    int matchesPlayed;
    int run, wkts;

    public Player() {
        this.name = "MSD";
        this.run = 3400;
        this.wkts = 11;
        this.matchesPlayed = 20;
    }

    public Player(String name, int matchesPlayed, int run, int wkts) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.run = run;
        this.wkts = wkts;
    }

    
    void setName(String name) {
        this.name = name;
    }

    void setMatchesPlayed(int matches) {
        this.matchesPlayed = matches;
    }

    void setRuns(int runs) {
        this.run = runs;
    }

    void setWkts(int wkts) {
        this.wkts = wkts;
    }

    String getName() {
        return this.name;
    }

    int getMatchesPlayed() {
        return this.matchesPlayed;
    }

    int getRuns() {
        return this.run;
    }

    int getWkts() {
        return this.wkts;
    }

    void display() {
        System.out.println("Player Name : " + this.name);
        System.out.println("Matches Played : " + this.matchesPlayed);
        System.out.println("Player Runs : " + this.run);
        System.out.println("Player Wkts : " + this.wkts);
    }
}

public class TestPlayer {

    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player("Jadeja",40,2000,30);

        p1.setName("Pratik");
        p1.setMatchesPlayed(4);
        p1.setRuns(400);
        p1.setWkts(12);

        p1.display();
        p2.display();
        p3.display();
    }
}
