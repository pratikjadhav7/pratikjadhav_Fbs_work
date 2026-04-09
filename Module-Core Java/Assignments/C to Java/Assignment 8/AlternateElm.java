public class AlternateElm{
    public static void main(String[] args) {
            int []arr={23,45,90,11,30};
        
        for(int ele:arr){
            System.out.println(ele);
        }
        for(int i=0;i<arr.length;i+=2){
            System.out.print(" "+arr[i]);
        }
    }
}