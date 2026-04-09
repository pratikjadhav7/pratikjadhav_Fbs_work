
public class EvenOdd {

    public static void main(String[] args) {
        int[] arr = {23, 45, 90, 11, 30};

        for (int ele : arr) {
            System.out.println(ele);
        }

        System.out.println("Even Numbers:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }

        }
        System.out.println("Odd Numbers:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
