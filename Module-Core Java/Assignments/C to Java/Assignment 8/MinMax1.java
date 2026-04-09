public class MinMax1{
    public static void main(String[] args) {
        int []arr={23,45,90,11,30};
        
        for(int ele:arr){
            System.out.println(ele);
        }
        int min=arr[0];
        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Max : "+max);
        System.out.print("MIN : "+min);
    }
}