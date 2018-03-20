
public class Student extends Register {
	 protected static String id;
	 protected String name;
	
	public Student() {
		
	}
	public void Student(String id,String name) {
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
