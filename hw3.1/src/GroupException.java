
public class GroupException extends Exception {
	String errStr = "Error performing group operation";
	
	public GroupException(){		
	}
	
	public GroupException(String errStr){
		this.errStr = errStr;		
	}

	@Override
	public String toString() {
		return errStr;
	}
	
	
}
