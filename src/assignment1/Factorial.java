package assignment1;

public class Factorial {

	public static void main(String[] args) {
		int num = 5;
		System.out.println("The factorial of the number "+num+" is: "+Fact(num));

	}
    
	public static int Fact(int n) {
		if((n==0) || (n==1)) {
			return 1;
		}
		else {
			return(n*Fact(n-1));
		}
		
	}
}
