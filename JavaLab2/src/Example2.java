import java.text.*; //1. import library format number
public class Example2 {

	public static void main(String[] args) {
		//2. define obkect call decimalFormat Class
		DecimalFormat frm = new DecimalFormat("#,###.00");
	 final int BUFFET = 299;
	 int numberCustomer = 5;
	 float totalprice =+(BUFFET*numberCustomer);
	 System.out.println("Buffet of "+numberCustomer+"customers is "+frm.format(totalprice));
	 //3. apply frm object to totalprice
	 float Charge= totalprice+(totalprice*3/100);
	 System.out.println("Add Service Charge 3% is "+frm.format(Charge));
	

		
		

	}

}
