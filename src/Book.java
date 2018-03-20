public class Book {
	private String title = "No name";
	private String type = "No type";
	public Book() {
		
	}
	public Book(String title,String type) {
		this.title = title;
		this.type = type;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public String getType() {
		return type;
	}
}
