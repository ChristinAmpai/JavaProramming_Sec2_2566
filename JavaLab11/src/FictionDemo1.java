import java.util.*;
public class FictionDemo1 {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	     
		  System.out.print("BookName ");
	      String name = scan.nextLine();
	      System.out.print("Year ");
	      int Year = scan.nextInt();
	      System.out.print("");
	      FictionBook book = new FictionBook(name,Year);
	      scan.nextLine();
	      System.out.print("author name ");
	      String aname = scan.nextLine();
	      System.out.print("author email");
	      String aemail = scan.nextLine();
	      
	      book.setAuthorName(aname);
	      
	      book.setEamil(aemail);
	      
	      while(book.checkFormatName()== false) {
	    	  System.out.print("author name ");
	    	  aname = scan.nextLine();
	    	  book.setAuthorName(aname);
	      }
	      while(book.checkEmail()==false) {
	    	  System.out.print("author email");
	    	  aemail = scan.nextLine();
	    	  book.setEamil(aemail);
	      }
	      System.out.print(book);
	        
	      
	      
	}
}
