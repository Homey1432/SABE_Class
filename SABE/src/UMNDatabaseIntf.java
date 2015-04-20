import java.util.Set;


public interface UMNDatabaseIntf {

	public Set<User> getAllUsers();
	public StudentRecord getRecordFor(User student);
	public void replaceStudentRecord(User student, StudentRecord record);
}
