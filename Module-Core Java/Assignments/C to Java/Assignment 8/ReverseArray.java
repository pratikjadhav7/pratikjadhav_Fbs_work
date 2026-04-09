public class ReverseArray{
    public static void main(String[] args) {
        int [] arr={12,67,34,22,90};

        int start=0;
        int end=arr.length-1;

        for(int i=0;i<arr.length;i++){
            if(start<end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;

                start++;
                end--;
            }
        }
        System.out.println("Reversed Array:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}