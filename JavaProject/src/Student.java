
public class Student extends User{
	
	private String endrolledCourses;

	public Student(int id, String firstName, String lastName, String endrolledCourses) {
		super(id, firstName, lastName);
		this.endrolledCourses=endrolledCourses;
	}

	public String getEndrolledCourses() {
		return endrolledCourses;
	}

	public void setEndrolledCourses(String endrolledCourses) {
		this.endrolledCourses = endrolledCourses;
	}
	
	

}
