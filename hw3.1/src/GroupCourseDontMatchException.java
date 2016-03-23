
public class GroupCourseDontMatchException extends GroupException {
	
	Student student; 
	
	public GroupCourseDontMatchException(){
		System.out.println("ERROR: " +"Course does not match");
	}
	
	public GroupCourseDontMatchException(Student student){
		this.student = student;
	}

	@Override
	public String toString() {
		return (student != null)?"ERROR: " +"Student's " + student + " course " + student.getCourse() + " does not match the group's course":"ERROR: " +"Course does not match";	
	}
	
	
}
