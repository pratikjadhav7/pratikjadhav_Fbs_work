
import java.util.Scanner;

public class SearchElm{
    public static void main(String[] args) {
        int[] arr={12,45,89,45,66};
        int found=0;
         int n;

        System.out.println("Enter Element to Find:");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                found=1;
                break;
            }
        }
        if(found==1){
            System.out.println("Found!");
        }else{
            System.out.println("Not found!");
        }

    }
}