import java.util.*;
import javax.swing.*;
public class Example_502 {

	public static void main(String[] args) {
		  // 1.input email from dialog box
          String yourEmail = JOptionPane.showInputDialog("Input your e-mail:");
          //check email start with @ or space bar or not 
          yourEmail = yourEmail.toLowerCase();
          while(yourEmail.startsWith("@")||yourEmail.startsWith(" ")){
        	 yourEmail = JOptionPane.showInputDialog("Input your e-mail:");
          }
          //check email end with hotmail.com or gamil.com or not
      if(yourEmail.endsWith("hotmail.com")||yourEmail.endsWith("gamil.com")) {
    	  JOptionPane.showInputDialog(null,"Your e-mail is :"+yourEmail);
      }
      else {
    	  
    	  JOptionPane.showMessageDialog(null,"Your email is not hotamil or gmail dot com");
      }
	}
}
