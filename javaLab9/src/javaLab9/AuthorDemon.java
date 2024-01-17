package javaLab9;
import java.util.Scanner;

public class AuthorDemon {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input author name    : ");
		String name = scan.nextLine();
 
		System.out.print("Input author e-mail  : ");
		String email = scan.next();
 
 
		System.out.print("Input author gender  : ");
		char gender = scan.next().charAt(0);
 
		author total = new author(name,email,gender);
 
		System.out.println();
		System.out.println(total);
	}
 
}