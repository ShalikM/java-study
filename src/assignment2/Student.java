package assignment2;

import java.util.Scanner;

public class Student implements IDetails{

	private String name;
	private String SSN;
	private String email;
	static private int staticID=100;
	@SuppressWarnings("unused")
	private String userID;
	private int random;
	private String[] courses = {"Bachelors in Engineering ($10,000.00)","Bachelors in Computer Applications ($7,000.00)","Bachelors in Computer Science ($5,000.00)"};
	private String phone;
	private String city;
	private String state;
	private int course;
	private double amount;
	private int flag=0;
	
	public Student() {
		
	}
	public Student(String name,String SSN) {
		this.name=name;
		this.SSN=SSN;
		System.out.println("Welcome "+name);
		System.out.println("Your generated email ID is: "+toString());
		System.out.println("Your generated User ID is: "+genID());
	}
	
	public String toString(){
		String lname=name.toLowerCase();
		email = lname + SSN.substring(5,7) + "@univ.com";
		return email;
	}
	
	public String genID() {
		staticID++;
		random = 1000 + (int)(Math.random() * ((9000 - 1000) + 1));
		return userID = staticID+""+random+SSN.substring(3, 7);
	}
	
	@SuppressWarnings("resource")
	public void enroll() {
		System.out.println("Select the cousre you want to enroll for:");
		for(int i=0;i<courses.length;i++) {
			System.out.println((i+1)+". "+courses[i]);
		}
		Scanner scan = new Scanner(System.in);
		course = scan.nextInt();
		System.out.println("You have selected the "+ courses[course-1] +" course");
		switch(course) {
		case 1:
		case 2:
		case 3:
			System.out.println("Kindly pay the required fees. To pay now, press y");
			Scanner scan1 = new Scanner(System.in);
			String choice = scan1.next();
				switch(choice) {
				case "y":
				case "Y":
						System.out.println("Redirecting to payment gateway.");
						if(course==1) {
							System.out.println("To make a payment of $10,000 press enter.");
							Scanner scanner = new Scanner(System.in);
							   scanner.nextLine();
							pay(10000);
							}
						else if(course==2) {
							System.out.println("To make a payment of $7,000 press enter.");
							Scanner scanner = new Scanner(System.in);
							   scanner.nextLine();
							pay(7000);
						}
						else {
							System.out.println("To make a payment of $5,000 Press enter.");
							Scanner scanner = new Scanner(System.in);
							   scanner.nextLine();
							pay(5000);
						}
						break;
				default: System.out.println("You can enroll for the course only after payment of fees.");
						 flag=1;
				}
				break;
		default: System.out.println("Course choice is incorrect");
		}
		
		
	}
	
	public void pay(double amount) {
		System.out.println("Payment of $"+amount+"done successfully");
		this.amount=amount;
		checkBalance();
	}
	
	private void checkBalance() {
		System.out.println("Your current balance is: $"+amount);
	}
	
	public void checkCourses() {
		System.out.println("Courses avaialable are:");
		for(int i=0;i<courses.length;i++) {
			System.out.println((i+1)+". "+courses[i]);
		}
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public int flagStatus() {
		return flag;
	 }
}
