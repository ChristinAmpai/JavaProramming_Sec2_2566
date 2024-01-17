package javaLab9;
import java.util.*;
public class BookDemo1_2 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		       
			   System.out.print("Input book title:");
		       String title = scan.next();
		       System.out.print("Input book price:");
		       float price = scan.nextFloat();
		       System.out.print("Input publish year:");
		       int year = scan.nextInt();
		       Book book = new Book();
		       book.setTitle(title);
		       book.setPrice(price);
		       book.setPublishyear(year);
		       System.out.println(book.toString());
   }
	 
}