import java.util.*;
public class testPiggyBank {
         static PiggyBank pb = new PiggyBank();
         static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/*PiggyBank pb = new PiggyBank();
		pb.testPeggyBank(500);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addTwo (34);
		System.out.println("Add 2 Baht Money : " + 34);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addten (13);
		System.out.println("Add 10 Baht Money : " + 13);
		System.out.println("Money Total : " + pb.getTotal());
		pb.addFive(100);*/
		inputCoin();
	}
	 public static void inputCoin() {
		 System.out.println("Money Total : "+pb.getTotal());
		 System.out.print("Please difine size of PiggyBank : ");
		 int sizeofPiggyBank = scan.nextInt();
		 pb.testPeggyBank(sizeofPiggyBank);
		 System.out.println("Money Total : "+pb.getTotal());
		 MainMenu();
	 }
	  public static void MainMenu() {
		 while(true) {
			 System.out.println("===================================");
			 System.out.println("Menu of PiggyBank");
			 System.out.println("===================================");
			 System.out.println("[1] one baht.");
			 System.out.println("[2] two baht");
			 System.out.println("[3] five baht");
			 System.out.println("[4] ten baht");
			 System.out.println("[5] Exit");
			 System.out.print("===================================");
			 System.out.print("Please Select Menu[1-5] : ");
			 int choice = scan.nextInt();
			 int coin;
			 if (choice==1) {
				System.out.print("Insert 1 Baht Money : ");
				coin = scan.nextInt();
				pb.addOne(coin);
				System.out.println("Money Total : "+pb.getTotal());
				System.out.println("");
			 }else if (choice == 2) {
				 System.out.print("Insert 2 Baht Money : ");
				 coin = scan.nextInt();
				 pb.addTwo(coin);
				 System.out.println("Money Total : "+pb.getTotal());
				 System.out.println("");
			     }else if (choice == 3) {
				 System.out.print("Insert 5 Baht Money : ");
				 coin = scan.nextInt();
				 pb.addFive(coin);
				 System.out.println("Money Total : "+pb.getTotal());
				 System.out.println("");
				 }
				 else if (choice == 4) {
					 System.out.print("Insert 10 Baht Money : ");
					 coin = scan.nextInt();
					 pb.addten(coin);
					 System.out.println("Money Total : "+pb.getTotal());
					 System.out.println("");
				 
			 }else if (choice == 5) {
				 System.out.print("Bye Bye");
				 	break;		 
			 }
		 } 
		 
	  }
}
	
	


