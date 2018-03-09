
public class Register {
	private String grade ="None";
	Student fromStudent;
	Course toCourse;
	public Register(Student instudent,Course incourse) {
		fromStudent=instudent;
		toCourse=incourse;
	}
	public void setGrade(String grade) {
		this.grade=grade;
	}
	public void setGrade(int score) {
		if(score>=80)
			this.grade="A";
		else if(score>=70)
			this.grade="B";
		else if(score>=60)
			this.grade="C";
		else if(score>=50)
			this.grade="D";
		else
			this.grade="F";
	}
	public String getGrade() {
		return this.grade;
	}
}
