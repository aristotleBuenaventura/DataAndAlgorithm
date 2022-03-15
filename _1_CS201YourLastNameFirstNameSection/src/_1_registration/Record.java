package _1_registration;

//To put together the individual elements of the array into an object array. 
public class Record {
	
	private Student student = new Student();
	private Teacher teacher = new Teacher();
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	

}
