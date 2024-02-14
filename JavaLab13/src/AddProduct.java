import java.io.*;
import java.util.*;
public class AddProduct {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		// create object for wite data to file using printWriter class		
	    PrintWriter writeFile = new PrintWriter(new FileWriter("d:\\txtFile\\product.txt",true));
	   // create object for input data from keyboard
	 
	    Scanner scan = new Scanner(System.in);
	 	//Display and input data from Keyborad 
	    System.out.print("Input product id:");
	    String productId =scan.next();
	    System.out.print("Input product Name:");
	    String productName =scan.next();
	    System.out.print("Input product Unit:");
	    String productUnit =scan.next();
	    System.out.print("Input product Price:");
	    float productPrice = scan.nextFloat();
	    
	    writeFile.println(productId+","+productName+","+productUnit+","+productPrice);
	    System.out.println("Save file already.....");
	    writeFile.close();
	}

}
