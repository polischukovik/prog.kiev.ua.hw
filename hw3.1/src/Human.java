
public class Human {
	
	private String firstName = "";
	private String lastName = "";
	private String gender = "";
	
	public Human(String firstName, String lastName, String gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Human [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ ", Class()=" + getClass() + "]";
	}
	
	public void show(){
		System.out.println(this);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
