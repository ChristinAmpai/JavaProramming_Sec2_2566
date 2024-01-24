
public class Date {
	private int dMonth;
	private int dDay;
	private int dYear;

	
	Date (){
		dMonth = 1;
		dDay = 1;
		dYear = 1999;
	}
     public Date(int month,int day,int year) {
    	 dMonth = month;
    	 dDay = day;
    	 dYear = year;
}
     public void setDate(int month,int day,int year) {
    	 month = month;
    	 day = day;
    	 year = year;
    	 
     }
     public int getMonth () {
    	 return dMonth;
     }
     public int getDay () { 
    	 return dDay;
     }
     public int getYear () {
    	 return dYear;
     }
     public String toString() {
    	 return " "+dMonth+" "+dDay+" "+dYear;
     }
     }