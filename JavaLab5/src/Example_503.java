import java.util.*;
import javax.swing.*;
public class Example_503 {

	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		//input data from console 
		System.out.print("Input a sentence: ");
		String sentence = scan.nextLine();
		//Check sentance end with . or not 
		
		while(!sentence.endsWith(".")) {
			System.out.print("Input a sentence, again: ");
			 sentence = scan.nextLine();
		}
		int countSpace =0;
		for (int i=0;i<sentence.length()-1;i++) {
			if(sentence.charAt(i)==' ') {
				countSpace+=1;
			}
		}
		System.out.println();
		System.out.println("This sentence has "+countSpace+"spaces");
		System.out.println("This sentence has "+(countSpace+1)+"word.");
	}

}
