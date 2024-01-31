import java.time.Year;

public class FictionBook implements Book,Author {
 
	private String author_name;
	private String email;
	private String titel;
	private int publicYear;
	
	public FictionBook(String title,int publicYear) {
		this.titel = titel;
		this.publicYear = publicYear;
	}
	public void setAuthorName(String name) {
		author_name = name;
	}
	public void setEamil(String email) {
		this.email = email;
	}
	public String getLastName () {
		return author_name.substring(author_name.indexOf(" ")+1).toUpperCase(); 
	}
	public String getFirstName () {
		return author_name.substring(0,author_name.indexOf(" ")).toUpperCase();
	}
	
	public boolean checkFormatName() {
		if (author_name.indexOf(" ")!=-1) {
			return true;
		}else {
			return false;
		}
	}
    public boolean checkEmail() {
     if(email.endsWith("@hotmail.com")|| email.endsWith("@windowslive.com")) {
    	 return true;
     }  
     else {
    	 return false;
     }
     }
     public int totalPublicYear() {
    	 return Year.now().getValue()-this.publicYear;
     }
     public String toString() {
    	 return getTitle()+"wite by"+ getLastName().substring(0,1)+","+getFirstName()+"("+email+")"+"\nPublishd for"
         +totalPublicYear()+"years";
     }
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
    
    }

     
     

