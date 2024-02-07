import java.io.*;
import java.util.*;
public class Lab1203 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//BookData.txt"));
		String tmp = "";
		int countBook = 0,i=1;
		while(( tmp= readFile.readLine())!=null) {
			 String[] data = tmp.split("\t");
			 
			 String bookname = data[0];
			 
			 String name = data[1];
			 
			 String rating = data[2];
			 
			 String yearbook = data[5];
			 
			 System.out.println(i+"."+bookname+" ("+name+ "),Rating "+rating+ " publist on "+yearbook);
			 countBook++;
			 i++;
			 
		}
		System.out.println("=====================================================");
		System.out.println("Total number of book : "+countBook);
		readFile.close();
	}
}
