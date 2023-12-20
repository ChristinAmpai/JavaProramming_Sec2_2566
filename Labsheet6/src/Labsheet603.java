import java.util.*;
public class Labsheet603 {
	

	public static void main(String[] args) {
    
		System.out.println("Please enter your name,separated by a space.");
		System.out.print(":");
		Scanner scan =new Scanner(System.in);
		String fullname = scan.nextLine();
		String firstname = fullname.substring(0,fullname.indexOf(" "));
		String abbrename = abbreviatName(fullname);
		
		int space = fullname.indexOf(' ');
		String name = fullname.substring(0,space);
		
	    System.out.println(abbreviatName(fullname)+name);
	
 
	   }
	   public static String abbreviatName(String fullname) {
		
		String name = "";
		
		for(int i = 0;i<fullname.length();i++) {
			
			if(fullname.charAt(i)==' ') {
			
				name = name + fullname.charAt(i+1)+".";
			
	   }
		
		} return name;
	
	}
}
