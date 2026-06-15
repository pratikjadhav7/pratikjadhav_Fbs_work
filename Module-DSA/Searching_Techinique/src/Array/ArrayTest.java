package Array;

public class ArrayTest {

    public void linearSearchAlgo(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                System.out.println("Element Found at index: " + i);
               return;
            }
        }

        System.out.println("Element Not Found!");
    }

    public void binarySearchAlgo(int [] arr,int key) {
    	int start=0;
    	int end=arr.length-1;
    	
    	while(start<=end) {
    		int mid = start+end/2;
    		
    		if(arr[mid]==key) {
    			System.out.println("Found!");
    			return;
    		}
    		else if(arr[mid]<key) {
    			start=mid+1;
    		}else {
				end=mid-1;
			}
    	}
    	System.out.println("Element Not Found!");
    }
    public static void main(String[] args) {

        int[] arr = {2, 34, 56, 67, 78,90,44,50};

        ArrayTest obj = new ArrayTest();
        obj.linearSearchAlgo(arr, 56);
        obj.binarySearchAlgo(arr,1);
    }
}