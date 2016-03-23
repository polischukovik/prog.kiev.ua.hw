
public class GroupNoStudentFound extends Exception {
	private Student student;
	private String name = "";
	
	
	public GroupNoStudentFound(){		
	}
	
	public GroupNoStudentFound(Student s){	
		student = s;
	}
	
	public GroupNoStudentFound(String firstName, String lastName){	
		name = firstName + " " + lastName;
	}

	@Override
	public String toString() {
		if (student != null) {
			return student + " was not found";
		}
		if (name != "") {
			return name + " was not found";
		}
		return "No student ";
	}
	
	
	
}
