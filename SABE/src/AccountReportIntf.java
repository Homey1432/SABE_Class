import java.math.BigDecimal;
import java.util.Map;
import java.util.Set;


public interface AccountReportIntf {

	public Map<String, Set<ReportItemIntf>> getItemsByCategory();
	public BigDecimal getAccountBalance();
	
	
}
