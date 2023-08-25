
package EmailApp;
import java.util.Scanner;


public class EmailApp {

	public static void main(String[] args) {
		
		Email em1=new Email("Nikhil", "kumar");
		//Email em2=new Email("golu", "kumar");
		
		//em1.setAlternateEmail("js@gmial.com");
		//System.out.println(em1.getAlternateEmail());
		
		//taking alternate email by the user at the run time beside of seting previously
		
		Scanner scr=new Scanner(System.in);
		System.out.println("Entre your alternate email adress");
		String em2=scr.nextLine();
em1.setAlternateEmail(em2);
System.out.println("your alternate email is"+em1.getAlternateEmail());


//setting new password
//em1.changePassword("kumar012345");
//System.out.println("your password is "+em1.getPassword());

//taking new password as a input
System.out.println("please entre your new password");
String pass=scr.nextLine();
System.out.println("your new password is: "+pass);



//calling showInfo method

System.out.println(em1.showInfo());


	}

	
	
}
