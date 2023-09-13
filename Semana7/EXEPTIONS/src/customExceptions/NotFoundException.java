package customExceptions;

public class NotFoundException extends Exception{
	
	String id;
	
	public NotFoundException(String id2) {
		super("Student with id: "+id2+" doesn't exist");
		id = id2;
	}
	
	public String getId() {
		return this.id;
	}

}
