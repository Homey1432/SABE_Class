public class Degree {
	
	// DCH 4/19/2015 all three of these variables are enums
	private DegreeProgram program;
	private Major major; 
	private College college; 
	
	public Degree () {
		
		
	}
	
	public Degree(DegreeProgram program, Major major, College college) {
		
	this.program = program;
	this.major = major;
	this.college = college;
	
	}
	
	public DegreeProgram getProgram() {
	
		return program;
		
	}
	
	public void setProgram(DegreeProgram program) {
		
		this.program = program;
		
	}
	
	public Major getMajor() {
		return major;
	}
	
	public void setMajor(Major major) {
		this.major = major;
	}
	
	public College getCollege() {
		return this.college;
	}
	
	public void setCollege(College college) {
		this.college = college;
	}
	
	//DCH 4/19/2015 Not sure what this is used for.....
	public int hashCode() {
		
		return 0;
	}
	
	//DCH 4/19/2015 Not sure what this is used for.....
	public boolean equals(Object obj) {
		return false;
		
	}
	
}
