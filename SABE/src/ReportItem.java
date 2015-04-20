import java.math.BigDecimal;


public class ReportItem implements ReportItemIntf {
	private String itemName;
	private String itemCategory;
	private BigDecimal itemAmount;
	
	public String getName() {
		// DCH 4/19/2015 filling in items as placeholder for now
		return itemName;
	}
	
	public String getCategory() {
		// DCH 4/19/2015 filling in items as placeholder for now
		return itemCategory;
	}

	public BigDecimal getAmount() {
		// DCH 4/19/2015 filling in items as placeholder for now
		
		return itemAmount;
	}

}
