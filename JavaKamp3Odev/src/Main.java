
public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, "Melike", "Da�l�", "MD123");
		Student student2 = new Student();
		student2.setFristName("NaimeNur");
		student2.setId(2);
		student2.setPassword("nnd586");
		
		
		
		
		StudentManager studentManager = new StudentManager ();
		Student[] student = {student1, student2};
		studentManager.levelUpdate(student);
		
		
		Instructor �nstructor = new Instructor(1, "Melisa", "Da�l�","md789" );
		InstructorManager �nstructorManager = new InstructorManager();
		�nstructorManager.add(�nstructor);
		
		UserManager userManager = new UserManager();
		userManager.add(student1);
		userManager.logout(student2);
		userManager.update(�nstructor);
		
		
		
		

	}

}

