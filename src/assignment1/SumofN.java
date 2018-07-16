package assignment1;

public class SumofN {

	public static void main(String[] args) {
		sum_n(10);
		
	}
   
	public static void sum_n(int n) {
		int i,sum=0;
		for(i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of numbers 1 to " + n + " is: "+sum);
	}
}
