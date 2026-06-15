package SelectionSort;

public class ArrayTest {

	public static void main(String[] args) {
		int [] arr= {30,1,15,48,4};
		
		for(int i=0;i<arr.length-1;i++) {
			int min=arr[i];
			int index=i;
			
			for(int j=i+1;j<arr.length;j++) {
				if(min>arr[j]) {
					min=arr[j];
					index=j;
				}
			}
			
			int temp=arr[i];
			arr[i]=arr[index];
			arr[index]=temp;
		}
		
		System.out.println("Sorted Array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}
}
