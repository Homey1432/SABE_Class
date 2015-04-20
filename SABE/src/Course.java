
public class Course {
	
	private Major major;
	private int level;
	private String name;
	private int credits;
	
	public int getCredits(){
	return credits;	
	}
	
	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public Major getMajor() {
		return major;
	}
	
	public void setMajor(Major major) {
		this.major = major;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int hashCode() {
		//DCH 4/19/2015 I am not sure what this means....
		
		return 0;
	}
	///equals(Object obj): boolean DCH 4/19/2015 I am  not sure what the purpose of this is....

}
