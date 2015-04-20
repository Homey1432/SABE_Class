import java.math.BigDecimal;
import java.util.List;
import java.util.Set;


public interface SABEIntf {

	public User currentUser = new User();
	public AccountReportIntf currentAccountReport = new AccountReport();
	public AccountReportIntf hypotheticalAccountReport = new AccountReport();
	public UMNDatabaseIntf databaseIntf = new UMNDatabase();
	
	public void loginAs(User user);
	public Set<User> getAllUsers();
	public AccountReportIntf getAccountReport(User theStudent);
	public AccountReportIntf getHypotheticalReport(User theStudent, List<Course> courseIds);
    public void addScholarship(User theStudent, BigDecimal amount, String description);
    public void addWaiver(User theStudent, BigDecimal amount, String description);
    public void addFee(User theStudent, BigDecimal amount, String description);
    public void addReceivedPayment(User theStudent, BigDecimal amount, String description);
    public void addOtherAdjustment(User theStudent, BigDecimal amount, String description);
    public void setStudentField(User theStudent, String note);
    
}
