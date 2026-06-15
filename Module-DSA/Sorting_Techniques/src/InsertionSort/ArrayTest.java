package InsertionSort;

public class ArrayTest {

	public static void main(String[] args) {
		int [] arr= {45,2,90,11,5,55};
		
		for(int i=1;i<arr.length;i++) {
			int key=arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			System.out.println("\nPASS: "+i);
			for(int i1=0;i1<arr.length;i1++) {
				System.out.print(" "+arr[i1]);
			}
			
		}
		
		System.out.println("\nSorted Array: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	}
}
