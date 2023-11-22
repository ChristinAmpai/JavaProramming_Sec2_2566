import javax.swing.*;
import java.text.DecimalFormat;
public class Example1 {

	public static void main(String[] args) {
		final int BUFFET = 299;
		DecimalFormat frm = new DecimalFormat("#,###.00");
		// input and convert data from dialog box
		int numberofCustomer = Integer.parseInt(JOptionPane.showInputDialog("Hoe many customber per bill"));
		
		double discount , totalPrice = 0;
		//calculate total price of buffet
		totalPrice = BUFFET * numberofCustomer;
		//using shoeMessage dailog box for displays totalPrice
		JOptionPane.showConfirmDialog(null, "Amount to be paid is "+ totalPrice + "baht.");
		int memberCard;
		do {
			memberCard = JOptionPane.showConfirmDialog(null, "Total price is "+String.format("%.2f",totalPrice) +"Baht." + "\nDo you have a member card?");	
		}while (memberCard==JOptionPane.CANCEL_OPTION);
		
		if(memberCard==JOptionPane.YES_OPTION) {
			discount = totalPrice * 90/100 ;
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+String.format("%.2f",discount) + "baht.");
			
		}
		else if (memberCard == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+String.format("%.2f", totalPrice) + "baht.");
		}
	}
 
}