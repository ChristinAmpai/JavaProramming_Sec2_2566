package javaLab9;

public class TheDateClass {
	
	private  int year;
	private  int month;
	private  int day;
	
	TheDateClass(int year,int month,int day){
         this.year = year;   
	     this.month = month;
	     this.day =day;
	}
	public int getYear() {
		return this.year;
	}
	public int getMonth() {
		return this.month;
	}
	public int getDay() {
		return this.day;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void setDay(int day) {
		this.year = day;
	}
	//Use built-in function String.format() to form a formatted String
	//Specifier "0" to print leading zero =>01/02/204
	public String toString() {
		return String.format("%2d/%2d/%4d",month,day,year);
	}
	public void setTheDateClass(int year, int month,int day) {
		 this.year = year;   
	     this.month = month;
	     this.day =day;
	}
	
	
}
