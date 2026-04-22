
import java.util.Scanner;

class Book {

    int BookID;
    String AuthorName, BookName, category;
    double price, rating;
}

public class BookManagement {

    static int count = 0;
    static Book[] books = new Book[100];

    static void addBook() {
        Book b = new Book();
        Scanner sc = new Scanner(System.in);

        System.out.println("----Enter Book Details-----");

        do {
            System.out.println("Book ID: ");
            b.BookID = sc.nextInt();

            if (b.BookID <= 0 || duplicateID(b.BookID)) {
                System.out.println("ID must be Positive and Unique!");
            }
        } while (b.BookID <= 0 || duplicateID(b.BookID));

        sc.nextLine();

        do {
            System.out.println("Book Name: ");
            b.BookName = sc.nextLine();

            if (duplicateName(b.BookName)) {

                System.out.println("Name is Already Exists.Try Again!");
            }
        } while (duplicateName(b.BookName));

        System.out.println("Book Author: ");
        b.AuthorName = sc.nextLine();

        System.out.println("Book Category: ");
        b.category = sc.nextLine();

        do {
            System.out.println("Book Price: ");
            b.price = sc.nextDouble();

            if (b.price <= 0) {
                System.out.println("Price must be Positive!");
            }
        } while (b.price <= 0);

        do {
            System.out.println("Book Rating (0-5): ");
            b.rating = sc.nextDouble();

            if (b.rating < 0 || b.rating > 5) {
                System.out.println("Please rate out of 5!");
            }
        } while (b.rating < 0 || b.rating > 5);

        System.out.println("*****Book Added Successfully*****");
        books[count] = b;
        count++;
    }

    static void displayBook() {
        for (int i = 0; i < count; i++) {
            System.out.println("Book ID: " + books[i].BookID + " || Book Name: " + books[i].BookName + " || Author: " + books[i].AuthorName + " || Category: " + books[i].category + " || Price: " + books[i].price + " || Rating: " + books[i].rating);
        }
    }

    static void searchByID() {
        Scanner sc = new Scanner(System.in);
        int id;
        boolean found = false;
        System.out.println("Book ID: ");
        id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (books[i].BookID == id) {
                found = true;
                System.out.println("Book Name: " + books[i].BookName + "| Author: " + books[i].AuthorName + "| Category: " + books[i].category + "| Price: " + books[i].price + "| Rating: " + books[i].rating);
            }
        }
        if (found == false) {
            System.out.println("Book NOt Found!");
        }

    }

    static void searchByName() {
        Scanner sc = new Scanner(System.in);
        String name;
        boolean found = false;
        System.out.println("Book Name: ");
        name = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (books[i].BookName.equalsIgnoreCase(name)) {
                found = true;
                System.out.println("Book Name: " + books[i].BookName + "| Author: " + books[i].AuthorName + "| Category: " + books[i].category + "| Price: " + books[i].price + "| Rating: " + books[i].rating);
            }
        }
        if (found == false) {
            System.out.println("Book NOt Found!");
        }

    }

    static void showAuthor() {
        Scanner sc = new Scanner(System.in);
        String AuthorName;
        boolean found = false;
        System.out.println("Author Name: ");
        AuthorName = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (books[i].AuthorName.equalsIgnoreCase(AuthorName)) {
                found = true;
                System.out.println("Book Name: " + books[i].BookName + "| Author: " + books[i].AuthorName + "| Category: " + books[i].category + "| Price: " + books[i].price + "| Rating: " + books[i].rating);
            }
        }
        if (found == false) {
            System.out.println("Book NOt Found!");
        }

    }

    static void showCategory() {
        Scanner sc = new Scanner(System.in);
        String category;
        boolean found = false;
        System.out.println("Category: ");
        category = sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (books[i].category.equalsIgnoreCase(category)) {
                found = true;
                System.out.println("Book Name: " + books[i].BookName + "| Author: " + books[i].AuthorName + "| Category: " + books[i].category + "| Price: " + books[i].price + "| Rating: " + books[i].rating);
            }
        }
        if (found == false) {
            System.out.println("Book NOt Found!");
        }

    }

    static void sortByPrice() {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - 1; j++) {
                if (books[j].price < books[j + 1].price) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted By Price: ");
        for (int i = 0; i < count; i++) {
            System.out.println("Book: " + books[i].BookName + " | Price: " + books[i].price);
        }
    }

    static void sortByRating() {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count - 1; j++) {
                if (books[j].rating < books[j + 1].rating) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted By Rating: ");
        for (int i = 0; i < count; i++) {
            System.out.println("Book: " + books[i].BookName + " | Rating: " + books[i].rating);
        }
    }

    static void removeBook() {
        Scanner sc = new Scanner(System.in);
        int id;
        boolean found = false;
        System.out.println("Enter Book ID to Delete It!");
        id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (books[i].BookID == id) {
                found = true;
                for (int j = i; j < count - 1; j++) {
                    books[j] = books[j + 1];
                }
            }
        }
        if (found == true) {
            System.out.println("----Book Deleted Successfully----");
            count--;
        } else {
            System.out.println("Book Not Found!");
        }

    }

    static void updateBook() {
        int id;
        boolean found = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Book ID: ");
        id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (books[i].BookID == id) {
               found=true;
               System.out.println("Enter New Price");
               books[i].price=sc.nextDouble();
               System.out.println("Enter New Rating");
               books[i].rating=sc.nextDouble();
            }
        }
    }

    static boolean duplicateName(String name) {
        for (int i = 0; i < count; i++) {
            if (books[i].BookName.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    static boolean duplicateID(int id) {
        for (int i = 0; i < count; i++) {
            if (books[i].BookID == id) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("======= Book-Management System =======");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Remove Books");
            System.out.println("4. Search By ID");
            System.out.println("5. Search By Name");
            System.out.println("6. Show Author");
            System.out.println("7. Show Category");
            System.out.println("8. Sort By Price");
            System.out.println("9. Sort By Rating");
            System.out.println("10. Update Book");
            System.out.println("0. Exit");

            System.out.println("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    displayBook();
                    break;
                case 3:
                    removeBook();
                    break;
                case 4:
                    searchByID();
                    break;
                case 5:
                    searchByName();
                    break;
                case 6:
                    showAuthor();
                    break;
                case 7:
                    showCategory();
                    break;
                case 8:
                    sortByPrice();
                    break;
                case 9:
                    sortByRating();
                    break;
                case 10:
                    updateBook();
                    break;
                case 0:
                    System.out.println("-----THANK-YOU-----");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 0);
    }
}
