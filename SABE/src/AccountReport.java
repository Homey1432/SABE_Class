import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;



public class AccountReport implements AccountReportIntf {

	private BigDecimal reportBalance = new BigDecimal(0.0); 
	Set<AccountReportIntf> reportItems = new HashSet<AccountReportIntf>();

	public Map<String, Set<ReportItemIntf>> getItemsByCategory() {
		// TODO Auto-generated method stub
		return null;
	}


	public BigDecimal getAccountBalance() {
		// DCH 4/19/2015 At the end we should use this variable to report
		
		
		
		
		return reportBalance;
	}

}
