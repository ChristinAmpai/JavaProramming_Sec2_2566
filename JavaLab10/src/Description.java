import javax.swing.*;
public class Description {

	public static void main(String[] args) {
		Product sold = new Product();
		int buttonConfim = JOptionPane.showConfirmDialog(null,"Pattannakarn?");
		
		if (buttonConfim == 0) {
			sold = new PattanakarnBranch();
		}
		
		int  numberofProduct = Integer.parseInt(
				JOptionPane.showInputDialog("Input the number of product:"));
		sold.setUnit(numberofProduct);//การส่งค่ากลับ
		
		JOptionPane.showMessageDialog(null,sold.toString());
		
		
		
		

	}

}
