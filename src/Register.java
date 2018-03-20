public class Register  {
	private String grade = "None";
	static Student fromStudent;
	static Course toCourse;
	public Register(Student fromStudent,Course toCourse) {
		this.fromStudent = fromStudent;
		this.toCourse = toCourse;
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