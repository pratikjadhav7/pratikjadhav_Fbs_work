
abstract class Player {

    String name, country;
    int age, matchesPlayed, jersyNum;

    public Player() {
        this.name = "Not Given";
        this.country = "Not Given";
        this.jersyNum = 00;
        this.matchesPlayed = 00;
        this.age = 00;
    }

    public Player(String name, String country, int age, int matchesPlayed, int jersyNum) {
        this.name = name;
        this.country = country;
        this.age = age;
        this.matchesPlayed = matchesPlayed;
        this.jersyNum = jersyNum;
    }

    void setName(String name) {
        this.name = name;
    }

    void setCountry(String country) {
        this.country = country;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    void setJerseyNum(int jNum) {
        this.jersyNum = jNum;
    }

    String getName() {
        return this.name;
    }

    String getCountry() {
        return this.country;
    }

    int getAge() {
        return this.age;
    }

    int getMatchesPlayed() {
        return this.matchesPlayed;
    }

    int getJerseyNum() {
        return this.jersyNum;
    }

   abstract void display();
}

class CricketPlayer extends Player {

    int totalRuns, totalWkts;
    String battingStyle, bolwingStyle;

    public CricketPlayer() {
        super();
        this.totalRuns = 00;
        this.totalWkts = 00;
        this.battingStyle = "Not Given";
        this.bolwingStyle = "Not Given";
    }

    public CricketPlayer(String name, String country, int age, int matchesPlayed, int jersyNum, int totalRuns, int totalWkts, String battingStyle, String bolwingStyle) {
        super(name, country, age, matchesPlayed, jersyNum);
        this.totalRuns = totalRuns;
        this.totalWkts = totalWkts;
        this.battingStyle = battingStyle;
        this.bolwingStyle = bolwingStyle;
    }

    void setTotalRuns(int runs) {
        this.totalRuns = runs;
    }

    void setTotalWkts(int wkts) {
        this.totalWkts = wkts;
    }

    void setBattingStyle(String battingStyle) {
        this.battingStyle = battingStyle;
    }

    void setBowlingStyle(String bowlingStyle) {
        this.bolwingStyle = bowlingStyle;
    }

    int getTotalRuns() {
        return this.totalRuns;
    }

    int getTotalWkts() {
        return this.totalWkts;
    }

    String getBattingStyle() {
        return this.battingStyle;
    }

    String getBowlingStyle() {
        return this.bolwingStyle;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Age: " + age);
        System.out.println("Jersey Num: " + jersyNum);
        System.out.println("MAtches Played: " + matchesPlayed);
        System.out.println("Total Runs: " + totalRuns);
        System.out.println("Total Wkts: " + totalWkts);
        System.out.println("Batting Style: " + battingStyle);
        System.out.println("Bowling Style: " + bolwingStyle);
    }

}

class FootballPlayer extends Player {

    int totalGoals;
    String playingPosition;

    public FootballPlayer() {
        super();
        this.totalGoals = 00;
        this.playingPosition = "Not Given";
    }

    public FootballPlayer(String name, String country, int age, int matchesPlayed, int jersyNum, int totalGoals, String playingPosition) {
        super(name, country, age, matchesPlayed, jersyNum);
        this.totalGoals = totalGoals;
        this.playingPosition = playingPosition;
    }

    void setTotalGoals(int goals) {
        this.totalGoals = goals;
    }

    void setPlayingPosition(String position) {
        this.playingPosition = position;
    }

    int getTotalGoals() {
        return this.totalGoals;
    }

    String getPlayingPosition() {
        return this.playingPosition;
    }

    void display() {
         System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Age: " + age);
        System.out.println("Jersey Num: " + jersyNum);
        System.out.println("MAtches Played: " + matchesPlayed);
        System.out.println("Total Goals: " + totalGoals);
        System.out.println("Playing Position: " + playingPosition);
    }

}

public class PlayerAbstract {

    public static void main(String[] args) {
        Player p;
        
        p = new CricketPlayer("MSD", "India", 43, 255, 7, 5660, 10, "Right Hand", "Right Arm");
        p.display();

        System.out.println("");

        p = new FootballPlayer("Ronaldo", "Portugal", 40, 1300, 7, 1200, "Wing-half Forward");
        p.display();

    }
}
