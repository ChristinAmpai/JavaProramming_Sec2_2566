package javalab4;
import java.util.*;
import java.text.DecimalFormat;
public class SalespersonSalry {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final double COMMISSION_RATE =0.15;
		final int SENTINEL =-1;
		
		int sales;
		double salary; 
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter sales in dollars (or -1 to end ) : ");
			sales = scan.nextInt();
			if (sales == SENTINEL) {
				System.out.print("bye");
				break;
			}
			salary = 1000+sales*COMMISSION_RATE;
			System.out.println("Salry is :$"+frm.format(salary));
		}
	}

}
