import java.io.*;
import java.util.*;
public class SentenceText {

	public static void main(String[] args)throws IOException {
		// create object for wite data to file using printStream class		
		PrintStream writeFile = new PrintStream(new File("d:\\txtFile\\sentcnce.txt"));
		// create object for input data from keyboard
		Scanner scan = new Scanner(System.in);
		int i=1;
		while(true) {
			System.out.print("Sentcnce:  ");
			String word = scan.next();
			
			if(word.equalsIgnoreCase("stop")) {
				break;
			}
			//save data to file
			writeFile.println(i+":"+word);
			i++;
		}
		System.out.println("File is save!! ");
		
		writeFile.close();
		

	}

}
