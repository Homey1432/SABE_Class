import java.math.BigDecimal;
import java.util.List;
import java.util.Set;


public class SABE implements SABEIntf {

	private User currentUser = null;
	private AccountReportIntf currentAccountReport = null;
	private AccountReportIntf HypothecticalAccountReport = null;
	private UMNDatabaseIntf databaseIntf = new UMNDatabase();
	
	public void loginAs(User user) {
		// DCH 4/19/2015 set current user to the input field. Need to check if login is correct here
       // DCH 4/19/2015 Should set the role of the user here as well....
		currentUser = user;
		
	
	}


	public Set<User> getAllUsers() {
		// DCH 4/19/2015 return a Set of users from the UMNDatabase instance
		// DCH 4/19/2015 Where do we get the students from in the database? Will it be a
		// .txt document imported??
		
		return databaseIntf.getAllUsers();
	}

	
	public AccountReportIntf getAccountReport(User theStudent) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public AccountReportIntf getHypotheticalReport(User theStudent,
			List<Course> courseIds) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void addScholarship(User theStudent, BigDecimal amount,
			String description) {
		// TODO Auto-generated method stub

	}

	
	public void addWaiver(User theStudent, BigDecimal amount, String description) {
		// TODO Auto-generated method stub

	}

	
	public void addFee(User theStudent, BigDecimal amount, String description) {
		// TODO Auto-generated method stub

	}

	
	public void addReceivedPayment(User theStudent, BigDecimal amount,
			String description) {
		// TODO Auto-generated method stub

	}


	public void addOtherAdjustment(User theStudent, BigDecimal amount,
			String description) {
		// TODO Auto-generated method stub

	}


	public void setStudentField(User theStudent, String note) {
		// TODO Auto-generated method stub

	}

}
