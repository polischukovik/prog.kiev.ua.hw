/**
 * Student class extends Human adding course and avg mark property
 *  
 * @author opolishc
 *
 */
public class Student extends Human {
	
	private int course = 0; 
	private double averageMark = 0;
	
	public Student(String id, String firstName, String lastName, String gender,
			int course, double averageMark) {
		super(firstName, lastName, gender);
		this.course = course;
		this.averageMark = averageMark;
	}
	
	public Student(Human human, int gender, int course, double averageMark) {
		super(human.getFirstName(), human.getLastName(), human.getGender());
		this.course = course;
		this.averageMark = averageMark;
	}	
	
	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public double getAverageMark() {
		return averageMark;
	}

	public void setAverageMark(double averageMark) {
		this.averageMark = averageMark;
	}

	@Override
	public void show() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Student [course=" + course +  ", averageMark=" + averageMark
				+ ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getGender()=" + getGender() + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		return (this.getLastName()+this.getFirstName()).equals(s.getLastName()+s.getFirstName());
	}
	
	

}
