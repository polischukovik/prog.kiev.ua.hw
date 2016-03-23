
public class GroupCourseDontMatchException extends GroupException {
	
	Student student; 
	
	public GroupCourseDontMatchException(){
		System.out.println("Course does not match");
	}
	
	public GroupCourseDontMatchException(Student student){
		this.student = student;
	}

	@Override
	public String toString() {
		return (student != null)?"Student's " + student + " cource " + student.getCourse() + " does not match the group's course":"Course does not match";	
	}
	
	
}
