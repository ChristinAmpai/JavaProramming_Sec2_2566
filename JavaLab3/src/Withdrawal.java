import javax.swing.*;
import java.util.Random;
import java.text.DecimalFormat;
public class Withdrawal {

	public static void main(String[] args) {
		// using class Random for random money
		DecimalFormat frm = new DecimalFormat("#,###");
		Random rdmoney = new Random ();
		int balane = rdmoney.nextInt(9)*100000;
		//JOptionPane.showMessageDialog(null, "Your balance :"+balane);
		
		int money = Integer.parseInt(JOptionPane.showInputDialog( "Your balance :"+frm.format(balane)+
				"\nInput money to wihdraw "));
		//money/1000;
		//money%1000/500;
		//money%1000/500/100;
		//money%1000%500%100;
		
		if (money > balane) {
			
			JOptionPane.showMessageDialog(null,"Error:Cannot withdraw more than balance","Error"
			,JOptionPane.ERROR_MESSAGE);
		}
			else if (money > 20000) {
				JOptionPane.showMessageDialog(null,"Error:Cannot withdraw more than 20,000","Error"
			    ,JOptionPane.ERROR_MESSAGE);
			}
			else if (balane%100 != 0) {
				JOptionPane.showMessageDialog(null, "Error:Cannot withdraw  "+money%100+"baht.","Error"
			    ,JOptionPane.ERROR_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(null, "You withdraw "+frm.format(money)+"baht.\n"+
		"1000 = "+money/1000+"\n500 = "+money%1000/500+"\n100 = "+money%1000%500/100);
			}
		}
	}


