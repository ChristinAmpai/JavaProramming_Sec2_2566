package javaLab9;

public class author {
	private String name;
	private String email;
	private char gender;
	public author(String name, String email,char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public author(String name, String email) {
		this.name = name;
		this.email = email;
	}
	public author () {
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public String getGenderName () {
	   if (gender == 'm'|| gender =='M') {
		   return "Male";
	   }
	   else if (gender == 'f'|| gender =='F') {
		   return "Female";
	   }
	   else {
		   return "null";
	   }	  
	}
	public String toString() {
		if (getGenderName()!=null) {
			return "Author name: " + name + " (" + email + ";" + getGenderName() + ")";
		} else {
		return name + " (" + email +  ")";
		}
	}
}

