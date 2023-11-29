package javalab4;
import java.util.*;

public class JavaLab04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int currntNumber,previousNumber;
		
		System.out.print("Input bumer : " );
		previousNumber = scan.nextInt();
		
		while(true) {
			System.out.print("Input bumer : " );
			currntNumber = scan.nextInt();
			if(currntNumber < previousNumber) {
				break;
			}
			previousNumber = currntNumber;
		}
		System.out.print("\nBYE BYE");
		/*if(currntNumber < previousNumber) {
			
			System.out.print("BYE BYE");
		}*/
		
		
			
    }
}