
public class Course extends Register {
	 private String id;
	 private String name;
	
	public Course() {
		super(fromStudent, toCourse);
	}
	public void Course(String id,String name) {
		super(id);
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
