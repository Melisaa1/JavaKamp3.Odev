
public class Student extends User {
	int id;
	 String fristName;
	 String lastName;
     String password;
     
     public Student() {};
	
	
	public Student(int id, String fristName, String lastName, String password) {
	super(id, fristName, lastName, password);
		this.id = id;
		this.fristName = fristName;
		this.lastName = lastName;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFristName() {
		return fristName;
	}

	public void setFristName(String fristName) {
		this.fristName = fristName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
