package p1;

import java.util.Scanner;

class InvalidTicketNumberException extends Exception {
    public InvalidTicketNumberException(String message) {
        super(message);
    }
}

class TicketsSoldOutException extends Exception {
    public TicketsSoldOutException(String message) {
        super(message);
    }
}

class MovieBooking {

    static String movieName = "3 Idiots";
    static int ticketPrice = 200;
    static int remainingTickets = 50;

    // Method to book tickets
    public void bookTickets(int numberOfTickets)
            throws InvalidTicketNumberException, TicketsSoldOutException {

        // Check if tickets already sold out
        if (remainingTickets == 0) {
            throw new TicketsSoldOutException("Sorry! Tickets are sold out.");
        }

        // Validate ticket number
        if (numberOfTickets <= 0) {
            throw new InvalidTicketNumberException(
                    "Invalid ticket number! Please enter greater than 0.");
        }

        // Check requested tickets availability
        if (numberOfTickets > remainingTickets) {
            throw new TicketsSoldOutException(
                    "Only " + remainingTickets + " tickets available.");
        }

        // Successful booking
        remainingTickets -= numberOfTickets;

        int totalAmount = numberOfTickets * ticketPrice;

        System.out.println("\nBooking Successful for \"" + movieName + "\"!");
        System.out.println("Tickets booked: " + numberOfTickets);
        System.out.println("Total amount: " + totalAmount);
        System.out.println("Remaining tickets: " + remainingTickets);
    }
}

// Main Class
public class MovieTicketBookingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MovieBooking booking = new MovieBooking();

        while (MovieBooking.remainingTickets > 0) {

            System.out.println("Movie: " + MovieBooking.movieName);
            System.out.println("Remaining Tickets: " + MovieBooking.remainingTickets);
            System.out.print("Enter number of tickets to book: ");

            int tickets;

            try {
                tickets = sc.nextInt();

                booking.bookTickets(tickets);

            } catch (InvalidTicketNumberException e) {
                System.out.println(e.getMessage());

            } catch (TicketsSoldOutException e) {
                System.out.println(e.getMessage());

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter numbers only.");
                sc.nextLine(); // clear buffer
            }
        }

        System.out.println("\nSorry! Tickets are sold out.");
        sc.close();
    }
}