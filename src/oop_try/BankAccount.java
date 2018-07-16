package oop_try;

public class BankAccount {
	
	String ac_no;
	static final String ac_type="SAVINGS";
	String ac_name;
	
	BankAccount(){
		System.out.println("New A/c Created");
	}
	BankAccount(int ac_no){
		System.out.println("New A/c "+ac_no+" created");
	}
	BankAccount(int ac_no, String ac_name){
		System.out.println("New A/c "+ac_no+" under name of "+ac_name+" created");
	}
	
	void deposit() {
		
	}
	
	void withdraw() {
		
	}
}
