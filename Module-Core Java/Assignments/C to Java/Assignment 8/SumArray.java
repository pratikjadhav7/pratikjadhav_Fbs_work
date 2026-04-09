public class SumArray{
    public static void main(String[] args) {
        int[]arr1={23,45,55,10,12};
        int[]arr2={20,20,5,15,10};
        int[]arr3=new int[5];
        
        for(int i=0;i<arr3.length;i++){
            arr3[i]+=arr1[i]+arr2[i];
        }

        System.out.println("Sum Of Two Arrays:");
        for(int ele:arr3){
            System.out.println(ele);
        }
    }
}