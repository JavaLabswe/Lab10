
public class Course extends Register {
	 protected static String id;
	 protected static String name;
	
	public Course() {
		
	}
	public  void Course(String id,String name) {
		this.id = id;
		this.name = name;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
}
