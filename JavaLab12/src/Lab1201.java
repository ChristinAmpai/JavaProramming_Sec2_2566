import java.io.*;
import java.util.Scanner;
public class Lab1201 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner readFile = new Scanner(new File("d://txtFile//Memberlogin.txt"));
		
          
		while(readFile.hasNext()){
			
			String fname = readFile.next();
			
			String lname = readFile.next();
			
			String id = readFile.next();
			
			String email = readFile.next();
			
			String name = lname.substring(0,1).toUpperCase()+"."+fname;
			
			System.out.println(name+""+"("+email+")");

	}
		readFile.close();

}
}
