
public class Group {
	private String groupName;
	private int groupCourse;
	private int capasity;
	private Student[] students;
	
	public Group(String groupName, int groupCourse, int capasity) {
		super();
		this.groupName = groupName;
		this.groupCourse = groupCourse;
		this.capasity = capasity;
		students = new Student[capasity];
	}
	
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public int getGroupCourse() {
		return groupCourse;
	}
	public void setGroupCourse(int groupCourse) {
		this.groupCourse = groupCourse;
	}

	public void addStudent(Student student) throws GroupException {
		System.out.println(this + ": adding student " + student);
		
		if( countStudArray() == capasity ){
			throw new GroupIsFullException(student);
		}
		if ( groupCourse != student.getCourse() ){
			throw new GroupCourseDontMatchException(student);
		}
		
		for (int i = 0; i < countStudArray(); i++){
			if( students[i] != null && students[i].equals(student) ){
				throw new GroupException( student + " is alreadi in " + this );
			}
		}
		
		students[countStudArray()] = student;	
		System.out.println("Student added");
	}	
	
	private int countStudArray(){
		int cnt = 0;
		for (Student student : students){
			if ( student != null ){
				cnt++;
			}
		}
		return cnt;
	}
	
	private void shiftStudArray(int index){
		for( int i = index; i < capasity; i++){
			if ( i == capasity - 1 ){
				students[i] = null;
			}else{
				students[i] = students[i+1];
			}
		}
	}
	
	/**
	 * Removes student by object 
	 * @param student
	 * @throws GroupException 
	 */
	public void removeStudent(Student student) throws GroupNoStudentFound{
		int cnt = 0;
		for ( Student s : students){
			if ( s != null && s.equals(student)){
				shiftStudArray(cnt);
				System.out.println( s + "removed from " + this);
				return;
			}
			cnt++;
		}
		throw new GroupNoStudentFound(student);
	}
	
	/**
	 * Removes student by name
	 * @param student
	 * @throws GroupException 
	 */
	public void removeStudent(String firstName, String lastName) throws GroupNoStudentFound{
		int cnt = 0;
		for ( Student s : students){
			if ( s != null && s.getFirstName() + s.getLastName() == firstName + lastName ){
				shiftStudArray(cnt);
				System.out.println( s + "removed from " + this);
				return;
			}
			cnt++;
		}		
		throw new GroupNoStudentFound( firstName, lastName );
	}
	
	@Override
	public String toString() {
		return "Group [groupName=" + groupName + ", groupCourse=" + groupCourse + ", capasity=" + capasity + "]";
	}
	
	public void listGroup(){
		System.out.println(this);
		for( Student student : students){
			System.out.println(student);
		}
		System.out.println();
	}
	
	
}
