
public class Personalinfo {
 private Parson name;
 private Date bDay;
 private int personID;
 
 
 //Default constructor
 //Postcondition : firstname= "" lastname = ""
 //dmoth =1 dDay=1, and dYear= 1990
 //parsonId = 0
 Personalinfo(){
	 name = new Parson();
	 bDay = new Date();
	 personID = 0;
 }
 public Personalinfo(String first,String last,int month,int day,int year,int ID){
	 name = new Parson(first,last);
	 bDay = new Date(month,day,year);
	 personID = ID;
 }
 
 //Consructor with parnanter
 public void setPersonal(String first,String last,int month,int day,int year,int ID) {
	 name.setName(first,last);
	 bDay.setDate(month,day,year);
	 personID = ID;
 }
 public String toString() {
	 return "Name :"+name.toString() + "\n" + "Date of birth :"+bDay.toString ()+"\n"+"Peronal ID :"+personID;
 }
        
        }
	


