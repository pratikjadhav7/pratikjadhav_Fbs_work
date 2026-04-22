
import java.util.*;

class Player {

    String name;
    int matchesPlayed, runs, wkts, jNo;
}

public class PlayerManagement {

    static Player[] players = new Player[100];
    static int count = 0;

    static void addPlayer() {
        Player p = new Player();

        Scanner sc = new Scanner(System.in);
        System.out.println("----- Enter Player Details -----");

        sc.nextLine();

        do {
            System.out.println("Player Name:");
            p.name = sc.nextLine();

            if (isDuplicateName(p.name)) {
                System.out.println("Name already exists! Try again.\n");
            }
        } while (isDuplicateName(p.name));

        do {
            System.out.println("Player Jersey Num:");
            p.jNo = sc.nextInt();
            if (p.jNo <= 0) {
                System.out.println("Jersey Number must be Positive.Try Again!");
            }
        } while (p.jNo <= 0);

        do {
            System.out.println("Matches Played:");
            p.matchesPlayed = sc.nextInt();
            if (p.matchesPlayed <= 0) {
                System.out.println("It must be Positive.Try Again!");
            }
        } while (p.matchesPlayed <= 0);

        do {
            System.out.println("Total Runs:");
            p.runs = sc.nextInt();
            if (p.runs <= 0) {
                System.out.println("Runs must be Positive.Try Again!");
            }
        } while (p.runs <= 0);

        do {
            System.out.println("Total Wkts:");
            p.wkts = sc.nextInt();
            if (p.wkts <= 0) {
                System.out.println("Wkts must be Positive.Try Again!");
            }
        } while (p.wkts <= 0);

        System.out.println("***** Player Added Successfully! ******");
        players[count] = p;
        count++;
    }

    static void displayAll() {
        for (int i = 0; i < count; i++) {
            System.out.println("Player Name: " + players[i].name + " || Jersey Num: " + players[i].jNo + " || Matches Played: " + players[i].matchesPlayed + " || Total Runs: " + players[i].runs + " || Total Wkts: " + players[i].wkts);
        }
    }

    static void sortByRuns() {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - 1; j++) {
                if (players[j].runs < players[j + 1].runs) {
                    Player temp = players[j];
                    players[j] = players[j + 1];
                    players[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted By Runs:");
        for (int i = 0; i < count; i++) {
            System.out.println("Player Name: " + players[i].name + "Player Runs: " + players[i].runs);
        }
    }

    static void sortbyWkts() {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - 1; j++) {
                if (players[j].wkts < players[j + 1].wkts) {
                    Player temp = players[j];
                    players[j] = players[j + 1];
                    players[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted By Wkts:");
        for (int i = 0; i < count; i++) {
            System.out.println("Player Name: " + players[i].name + "Player Wkts: " + players[i].wkts);
        }
    }

    static void searchByName() {
        Scanner sc = new Scanner(System.in);

        String name;
        System.out.println("Player Name:");
        name = sc.next();
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (name.equalsIgnoreCase(players[i].name) == true) {
                found = true;

                System.out.println("Player Name: " + players[i].name + " | Jersey Number: " + players[i].jNo + " | Runs: " + players[i].runs + " | Wkts: " + players[i].wkts);
            }
        }
        if (found == false) {
            System.out.println("Player Not found!");
        }
    }

    static void searchByJNo() {
        Scanner sc = new Scanner(System.in);

        int Jno;
        System.out.println("Jersey Number:");
        Jno = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (players[i].jNo == Jno) {
                found = true;

                System.out.println("Player Name: " + players[i].name + " | Jersey Number: " + players[i].jNo + " | Runs: " + players[i].runs + " | Wkts: " + players[i].wkts);
            }
        }
        if (found == false) {
            System.out.println("Player Not found!");
        }
    }

    static void updatePlayer() {
        Scanner sc = new Scanner(System.in);

        String name;
        System.out.println("Player Name:");
        name = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (name.equalsIgnoreCase(players[i].name)) {
                found = true;
                System.out.println("Latest Runs:");
                players[i].runs = sc.nextInt();
                System.out.println("Latest Wkts:");
                players[i].wkts = sc.nextInt();
                System.out.println("Matches Played:");
                players[i].matchesPlayed = sc.nextInt();

                System.out.println("******* Player Updated Successfully *******");

            }
        }
        if (found == false) {
            System.out.println("Player Not found!");
        }
    }

    static void removePlayer() {
        Scanner sc = new Scanner(System.in);

        String name;
        System.out.println("Enter Player Name to Delete:");
        name = sc.next();
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (name.equalsIgnoreCase(players[i].name) == true) {
                found = true;
                for (int j = i; j < count - 1; j++) {
                    players[j] = players[j + 1];
                }
            }
        }
        if (found == true) {
            count--;
            System.out.println("Player Removed Successfully");
        } else {
            System.out.println("Player Not Found!");
        }
    }

    static boolean isDuplicateName(String name) {
        for (int i = 0; i < count; i++) {
            if (players[i].name.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int choice;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("====== Player Management System ======");
            System.out.println("1. Add Player");
            System.out.println("2. Display All");
            System.out.println("3. Sort By Runs");
            System.out.println("4. Sort By Wkts");
            System.out.println("5. Search By Name");
            System.out.println("6. Search By Jersey Number");
            System.out.println("7. Update Player");
            System.out.println("8. Remove Player ");
            System.out.println("0. Exit");

            System.out.println("Enter Choice");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addPlayer();
                    break;
                case 2:
                    displayAll();
                    break;
                case 3:
                    sortByRuns();
                    break;
                case 4:
                    sortbyWkts();
                    break;
                case 5:
                    searchByName();
                    break;
                case 6:
                    searchByJNo();
                    break;
                case 7:
                    updatePlayer();
                    break;
                case 8:
                    removePlayer();
                    break;
                case 0:
                    System.out.println("------Thank-You------");
                default:
                    System.out.println("Invalid Choice!");

            }

        } while (choice != 0);
    }
}
