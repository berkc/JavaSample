
public class Instructor extends User {
	
	private String publishedCourses;
	
	public Instructor(int id, String firstName, String lastName, String publishedCourses) {
		super(id, firstName, lastName);
		this.publishedCourses=publishedCourses;
	}
	
	public String getPublishedCourses() {
		return publishedCourses;
	}

	public void setPublishedCourses(String publishedCourses) {
		this.publishedCourses = publishedCourses;
	}
}
