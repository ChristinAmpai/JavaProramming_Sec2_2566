import java.io.*;
import java.util.*;
public class Lab1204 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//BookData.txt"));
		Scanner input = new Scanner(System.in);
		System.out.print("Enter rating of books: ");
		double inputrating = input.nextDouble();
		System.out.println("--------------------------------------------------------------");
		String tmp = "";
		int countBook = 0,i=1;
		
		while((tmp= readFile.readLine())!=null) {
			String[] data = tmp.split("\t");
			
			String bookname = data[0];
			String name = data[1];
			String rating = data[2];
			String reviews = data[3];
			if (Double.parseDouble(rating) >= inputrating) {
				System.out.println("Book " + i + ":" + bookname + " by " + name + " (" + reviews + ") reviews");
				countBook++;	
			}	
			i++;	
		}		
		readFile.close();	
		System.out.println("--------------------------------------------------------------");	
		System.out.println("There are " + countBook + " book get rating more than " + inputrating);		
	}		
}
