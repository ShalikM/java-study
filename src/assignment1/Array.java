package assignment1;

public class Array {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		System.out.println("The maximum value of the array is: "+maxArray(arr));
		System.out.println("The minimum value of the array is: "+minArray(arr));
		System.out.println("The average of the array values is: "+avgArray(arr));
	}
	
	public static int maxArray(int arr[]) {
		int i,max=arr[0];
		for(i=0;i<arr.length;i++) {
			if(arr[i]>max) {
					max=arr[i];
				}
		}
		return max;
	}
	public static int minArray(int arr[]) {
		int i,min=arr[0];
		for(i=0;i<arr.length;i++) {
			if(arr[i]<min) {
					min=arr[i];
				}
		}
		return min;
		
	}
	public static int avgArray(int arr[]) {
		int i,sum=0;
		for(i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return(sum/arr.length);
	}
}
