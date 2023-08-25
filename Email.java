

package EmailApp;

import java.util.*;
import java.util.Scanner;


public class Email {
	
	private String  firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity=500;
	private int defaultpasswordLength=10;
	private String alternateEmail;
	private String companySuffix="aeycompany.com";;
	
	//Constructor to recieve the first name and last name
	
	public Email(String firstName, String lastName) {
		this.firstName=firstName;
		this.lastName= lastName;
		System.out.println("Email created: "+ this.firstName+" "+ this.lastName);
		
		
		//call a method asking for the departement
		
		this.department=setDepartement();
		System.out.println("Department: "+ this.department);
		
		//call a method that return a random password
		
		this.password=randomPassword(defaultpasswordLength);
		System.out.println("your password is "+this.password);
		
	//combine elements to generate email
		
		email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		System.out.println("your email is: "+ email);
	}
	
	//Ask for the departement
	
	private String setDepartement() {
		System.out.print("Entre the departement \n1 for sales \n2 for Development \n3 for Accounting \n0 for more \n entre department code: ");
		
		Scanner in= new Scanner(System.in);
		
		int departementChoice=in.nextInt();
		
		if(departementChoice==1) {return "sales";}
		   else if(departementChoice==2) {return "develpoment";}
	           else if(departementChoice==3) {return "accounting";}
	           else {return "";}}
	
	
	//Generate the random password
		
		 final String randomPassword(int length)
		{
			String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()";
			char[] password= new char[length];
			for(int i=0; i<length; i++)
			{
			int rand=(int)(Math.random()*passwordSet.length());
				password[i]=passwordSet.charAt(rand);
				
			}
			return new String(password);
			
		}
		 
	
	// Set the maiboxCapacity
		 
		 public void setMailboxCapacity(int capacity) {
			 this.mailboxCapacity= capacity;
			 
		 }
	
	//set the alternate email
		 
		 public void setAlternateEmail(String altEmail) {
			 this.alternateEmail=altEmail;
			 
		 }
	
	//change the password
	
	public void changePassword(String password) {
		this.password=password;
		
	}
	public int getMailboxCapacity(){ return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() { return password;}
	
	//showing all the things at once
	public String showInfo() {
		return "Display Name: " +firstName+" "+lastName+
				"CompanyName: " +email+
				"Mail box capacity: "+mailboxCapacity+"mb";
		
	}

}
	
