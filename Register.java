
public class Register  {
	String grade = "None";
	static Student fromStudent;
	static Course toCourse;
	
	public Register(Student s2,Course c1) {
		Register.fromStudent = s2;
		this.toCourse = c1;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void setGrade(int score) {
		this.grade = grade;
	}
	public String getGrade() {
		return grade;
	}
	
}
