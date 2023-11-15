import java.text.DecimalFormat;

import javax.swing.*; //1.import library for input data from dialog box
public class Example04 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//2.Display and inpt data from dialog box
		String productName = JOptionPane.showInputDialog("Input product name:"); 
		//String strUit = JOptionPane.showInputDialog("Input product Unit:");
        //conver string to int
		//int unitPrice = Integer.parseInt(strUit);
		//String perunit = JOptionPane.showInputDialog("Input product per unit:");
		
		int unitPrice = Integer.parseInt(JOptionPane.showInputDialog("Input product Unit:"));
		
		float perunit = Float.parseFloat(JOptionPane.showInputDialog("Input product per unit:"));
		
		
		double totalPrice = unitPrice*perunit;
		double Vat = totalPrice+(totalPrice*7/100);
		JOptionPane.showMessageDialog(null,"Total Price is "+frm.format(totalPrice) + " baht."
				+ "\n Add VAT 7% is "+ frm.format(Vat) + " baht.");
		

	}

}
