
public class SerializeHelper {
	private StringBuilder sb;
	
	/**
	 * 
	 * [groupName;groupCourse;capasity;{[firstName;lastName;gender;averageMark;course]
	 * 									[firstName;lastName;gender;averageMark;course]
	 * 									}]
	 * 
	 */
	
	public SerializeHelper() {
		sb = new StringBuilder();
		sb.append("[");
	}

	public void appendString(String val) {
		sb.append(val).append(";");		
	}

	public void appendArray(Student[] students) {
		sb.append("{");
		for ( Student student : students){
			sb.append("[");
			appendString( student.getFirstName());
			appendString( student.getLastName());
			appendString( String.valueOf(student.getAverageMark()));
			appendString( String.valueOf(student.getCourse()));
			sb.deleteCharAt(sb.length()-1);
			sb.append("]");
		}
		sb.append("}").append("]");
	}

	@Override
	public String toString() {
		return sb.toString();
	}
}
