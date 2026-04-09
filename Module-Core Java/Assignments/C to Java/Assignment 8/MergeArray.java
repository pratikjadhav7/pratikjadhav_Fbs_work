public class MergeArray{
    public static void main(String[] args) {
        int[]arr1={23,45,55,10,12};
        int[]arr2={20,20,5,15,10};

        int s1=arr1.length;
        int s2=arr2.length;
        int s3=s1+s2;
        int []arr3=new int[s3];

        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            arr3[s1+i]=arr2[i];
        }

        System.out.println("Merged Array:");
        for(int elm:arr3){
            System.out.println(elm);
        }
    }
}