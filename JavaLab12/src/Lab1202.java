import java.io.*;
import java.util.*;
public class Lab1202 {

	public static void main(String[] args)throws IOException  {
		// TODO Auto-generated method stub
	Scanner readFile = new Scanner(new File("d://txtFile//Memberlogin.txt"));
	Scanner input = new Scanner(System.in);
	
	System.out.print("Input: ");
	
	String inputmail = input.nextLine();
	
	boolean found = false;
	     while (readFile.hasNext()) {
	       
	    	 readFile.next();
	
	    	 readFile.next();
	
	    	 String pass = readFile.next();
	
	    	 String mail = readFile.next();
	
	    	 if (mail.equals(inputmail)) {
	
	    		 System.out.println("Your password is " + pass);
	
	    		 found = true;
	    	 }
	     }
	     readFile.close();
	
	     if (found == false) {
	
	    	 System.out.println("The data not found...");
	     }
	}
}
