package assignment2;

import java.util.Scanner;

public class StudentDatabase {

	public static void main(String[] args) {
		
		int choice,flag=0;
		String name="",SSN="";
			
		Student temp=new Student();
		
		do{
	    flag=0;
	   	System.out.println("\n Welcome to Univ");
		System.out.println("1. View courses offered");
		System.out.println("2. Enroll for a course");
		System.out.println("3. Exit");		
	
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
				
		switch(choice) {
		case 1:
			temp.checkCourses();
			break;
			
		case 2:
				System.out.println("Enter your name: ");
				Scanner scan1 = new Scanner(System.in);
				name = scan1.next();
				System.out.println("Enter your 7-digit SSN: ");
				Scanner scan2 = new Scanner(System.in);
				SSN = scan2.next();
				Student s1 = new Student(name,SSN);
				s1.enroll();
				flag = s1.flagStatus();
				if(flag==1)
			    break;
				System.out.println("");
				System.out.println("Enter details");
				System.out.println("Enter your phone number: ");
				Scanner scan3 = new Scanner(System.in);
				String phone = scan3.next();
				s1.setPhone(phone);
				System.out.println("Enter your city: ");
				Scanner scan4 = new Scanner(System.in);
				String city = scan4.next();
				s1.setCity(city);
				System.out.println("Enter your state: ");
				Scanner scan5 = new Scanner(System.in);
				String state = scan5.next();
				s1.setState(state);
				System.out.println("Entered details are -- NAME: "+name+", SSN: "+SSN+", PHONE: "+phone+", CITY: "+city+", STATE: "+state);
			    break;
		
		case 3: System.out.println("Thank you for visiting Univ!");
				break;
				
		default: System.out.println("Wrong choice entered. Try again");
		 		 
		}
		}while((choice==1)||(choice==2)||(choice>3)&&(flag!=1));
		
		

	}
}

