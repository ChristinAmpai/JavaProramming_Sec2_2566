import java.text.DecimalFormat;
import java.util.*;
public class Example3 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
    //2.define objet for Scanner Class
		Scanner console = new Scanner(System.in);
    //3 display text input data
		System.out.print("Input product name : ");
		String productName = console.nextLine();
		System.out.print("Input product unit : ");
		int productUnit = console.nextInt();
		System.out.print("Input product per unit : ");
		Float productperunit = console.nextFloat();
		System.out.println("");
		float price = productUnit*productperunit;
		System.out.println("Total Price is "+frm.format(price)+ "\tBaht.");
		double vat =price+(price*7/100);
		System.out.println("Add VAT 7%  is "+frm.format(vat)+  "\tBaht.");
		   
	}

}
