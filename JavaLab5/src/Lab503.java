import java.util.*;
public class Lab503 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String Message = scan.nextLine();
		int space = Message.trim().indexOf(" ");
		if(Message.toLowerCase().indexOf("nichi")>=0) {
			System.out.print("Nichi is a sentence");
		}
		else {
	    System.out.println(" "+Message);
	  }
	}
}
