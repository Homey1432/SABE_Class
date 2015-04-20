
public class User {

	private String firstName = null;
	private String lastName= null;
	private String studentID= null;
	private Role role = null;
	
	public User() {
		
	}
	
	public User(String firstName, String lastName, String userID) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentID = userID;
	}
	
	public String getFirstName(){
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
	
	
	public String getUserId() {
		return studentID;
	}
	
	public void setUserID(String userId){
		this.studentID = userId;
	}
	
	public Role getRole() {
		
		return this.role;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}
	
	public int hashCode() {
		return 0;
	}
	
	public boolean equals(Object obj) {
		
		
		return false;
	}
}
