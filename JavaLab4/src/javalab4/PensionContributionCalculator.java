package javalab4;
import java.util.*;
import java.text.DecimalFormat;
public class PensionContributionCalculator {

	public static void main(String[] args) {
		
		DecimalFormat frm = new DecimalFormat("#,###.00");

		final double EMPLOYEE_RATE_55_Below = 0.2;
		final double EMPLOYER_RATE_55_Below = 0.17;
		final double EMPLOYEE_RATE_55_TO_60_Below = 0.13;
		final double EMPLOYER_RATE_55_TO_60_Below = 0.13;
		final double EMPLOYER_RATE_60_TO_65_Below = 0.075;
		final double EMPLOYEE_RATE_60_TO_65Below = 0.09;
		final double EMPLOYER_RATE_65_Below = 0.05;
		final double EMPLOYEE_RATE_65_Below = 0.075;
        
		//Scanner scan = Scanner
		int Salary_CEILING = 6000;
		Scanner scan = new Scanner(System.in); 
		int Salary,age;
		int contributableSalary;
		double employeeContribution,  employerContribution, totalContribution;
	 
		System.out.print("Enter the monthly salary : $ ");
		Salary = scan.nextInt();
		System.out.print("Enter the age :  ");
		age = scan.nextInt();
		contributableSalary = Math.min(Salary, Salary_CEILING);
		 if(age<=55) 
		{
			 employeeContribution = contributableSalary*EMPLOYEE_RATE_55_Below;
			 employerContribution = contributableSalary*EMPLOYER_RATE_55_Below;
			 totalContribution = employerContribution+employeeContribution;
		}
		 else if (age<=60) {
			 employeeContribution = contributableSalary*EMPLOYEE_RATE_55_TO_60_Below;
			 employerContribution = contributableSalary*EMPLOYER_RATE_55_TO_60_Below;
			 totalContribution = employerContribution+employeeContribution;
		 }
		 else if (age<=65) {
			 employeeContribution = contributableSalary*EMPLOYER_RATE_60_TO_65_Below;
			 employerContribution = contributableSalary*EMPLOYEE_RATE_60_TO_65Below;
			 totalContribution = employerContribution+employeeContribution;
		 }
		 else {
			 employeeContribution = contributableSalary*EMPLOYER_RATE_65_Below;
			 employerContribution = contributableSalary*EMPLOYEE_RATE_65_Below;
			 
		 }
		 totalContribution = employerContribution+employeeContribution;
		 System.out.printf("The employee's contribution is : $%.2f\n",employeeContribution);
		 System.out.printf("The employer's contribution is : $%.2f\n",employerContribution);
		 System.out.printf("The total Contribution is : $%.2f", totalContribution);
	}

}
