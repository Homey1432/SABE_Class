import java.util.List;


public class StudentRecord {
private User student;
private Semester semesterAdmitted;
private boolean isMinnesotaResident;
private boolean isInternationalStudent;
private boolean isInsuredOutsideofUMN;
private Degree degreeEnrolledIn;
private List<Course> registeredCourses;
private List<Adjustment> adjustments;
private List<String> notes;

	public StudentRecord() {
		
	}
	
	public User getStudent() {
		
		return student;
	}
	
	public void setStudent(User student) {
		
		this.student = student;
	}
	
	public Semester getSemesterAdmitted() {
		
		return semesterAdmitted;
	}
	
}
