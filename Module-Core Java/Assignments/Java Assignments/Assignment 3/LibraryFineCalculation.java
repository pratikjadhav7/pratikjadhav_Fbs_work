class LibraryUser{
    static double chargePerDay;

    int id;
    String userName;
    int num_of_days_book_returned_late;

    public LibraryUser(int id, String userName,int num_of_days) {
        this.id = id;
        this.userName = userName;
        this.num_of_days_book_returned_late=num_of_days;
    }

    static void chargePerDay(double newCharges){
        chargePerDay=newCharges;
    }
    
     double totalFine(){
        return num_of_days_book_returned_late*chargePerDay;
    }

    void calculateFine(){
        System.out.println("Library ID: "+this.id);
        System.out.println("User Name: "+this.userName);
        System.out.println("Number of Days for Books: "+this.num_of_days_book_returned_late);
        System.out.println("Total Fine: "+totalFine());
    }
}
public class LibraryFineCalculation{
    public static void main(String[] args) {
         
        LibraryUser.chargePerDay(20);

        LibraryUser l1=new LibraryUser(1,"Pratik",3);
        LibraryUser l2=new LibraryUser(2,"Snehal",5);

        l1.calculateFine();
        l2.calculateFine();

        LibraryUser.chargePerDay(10);

        l1.calculateFine();
        l2.calculateFine();

    }
}