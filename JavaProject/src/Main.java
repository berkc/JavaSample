
public class Main {

	public static void main(String[] args) {
		Student student = new Student(1, "berk", "colak", "Java");
		Instructor instructor= new Instructor(2, "Ali", "Veli", "Java");
		
		
		InstructorManger instructorManger= new InstructorManger();
		instructorManger.add(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
	}

}
