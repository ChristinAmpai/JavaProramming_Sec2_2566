package javalab4;

import java.util.Scanner;

public class Lab401 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input value of X : ");
		int X = scan.nextInt();
		System.out.print("Input value of Y : ");
		int Y = scan.nextInt();
		
		
		while(X>Y)
		{
			System.out.print("Input value of Y, again : ");
			Y = scan.nextInt();

		}
		int total = X;
		while(X<Y) {
			System.out.println(total+"+"+(X+1)+"="+(total+X+1));
			total = total+X+1;
			X++;
			
		}
		
	}

}
