
public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, "Melike", "Dağlı", "MD123");
		Student student2 = new Student();
		student2.setFristName("NaimeNur");
		student2.setId(2);
		student2.setPassword("nnd586");
		
		
		
		
		StudentManager studentManager = new StudentManager ();
		Student[] student = {student1, student2};
		studentManager.levelUpdate(student);
		
		
		Instructor ınstructor = new Instructor(1, "Melisa", "Dağlı","md789" );
		InstructorManager ınstructorManager = new InstructorManager();
		ınstructorManager.add(ınstructor);
		
		UserManager userManager = new UserManager();
		userManager.add(student1);
		userManager.logout(student2);
		userManager.update(ınstructor);
		
		
		
		

	}

}

