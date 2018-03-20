
public class Student extends Register {
	private String id;
    private String name;
	
	public Student() {
		super(fromStudent,toCourse);
	}
	public Student(String id,String name) {
		super(fromStudent,toCourse);
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
