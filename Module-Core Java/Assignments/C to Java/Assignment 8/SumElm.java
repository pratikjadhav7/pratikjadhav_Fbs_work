public class SumElm{
    public static void main(String[] args) {
        int []arr={23,45,90,11,30};
        int sum=0;

        for(int ele:arr){
            System.out.println(ele);
        }

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Sum : "+sum);
    }
}