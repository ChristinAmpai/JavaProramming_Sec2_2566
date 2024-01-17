package javaLab9;
import java.util.Scanner;
public class BookDemo1_2 {
	 
	public static void main(String[] args) {
		       Scanner scan = new Scanner(System.in);
			   System.out.print("Input book title:");
		       String title = scan.nextLine();
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