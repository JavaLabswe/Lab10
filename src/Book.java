
public class Book {
	
	String title="No name";
	private String type="No type";
	
	public Book(){

	}
	
	public  Book(String intitle,String intypeln) {
	title=intitle;
	type=intypeln;
	
	}
	
	public void setTitle(String intitleln) {
	title=intitleln;
	
	}
	
	public void setType(String intypeln) {
	
}
	public String getTitle() {
	return title;
	
	}
	
	public String getType() {
	return type;
	
	}
}