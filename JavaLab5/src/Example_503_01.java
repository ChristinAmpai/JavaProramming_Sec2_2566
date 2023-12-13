import java.util.*;
import javax.swing.*;
public class Example_503_01 {

	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		String sentence = JOptionPane.showInputDialog("Input a sentence: ");
		 sentence = scan.nextLine();
		
		while(sentence.endsWith(".")) {
			sentence = JOptionPane.showInputDialog("Input a sentence, again: ");
			 sentence = scan.nextLine();
		}
		int countSpace =0;
		for (int i=0;i<sentence.length()-1;i++) {
			if(sentence.charAt(i)==' ') {
				countSpace+=1;
			}
		}
		JOptionPane.showMessageDialog(null,"Your email is not hotamil or gmail dot com");
	}

}
