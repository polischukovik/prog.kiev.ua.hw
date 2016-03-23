
public class GroupIsFullException extends GroupException {
	Student student;

	public GroupIsFullException() {
	}

	public GroupIsFullException(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return (student == null)?"Group id full, student can not be added":"Group id full, student " + student + " can not be added";
	}
	
	
}
