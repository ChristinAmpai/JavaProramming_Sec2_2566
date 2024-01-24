
public class Parson {

	private String firstName;
    private String lastName;
    
    Parson(){
    	firstName = "";
    	lastName = "";
	}
    Parson(String first, String last){
    	//firstName = first;
    	//lastName = last;
    	setName(first,last);
    }
    public void setName (String first, String last) {
    	firstName = first;
    	lastName = last;
    }
    public String getFirstName() {
    	return firstName;
    }
    public String getLastName() {
    	return lastName;
    }
    public String toString () {
    	return firstName+" "+lastName;
    }
}
