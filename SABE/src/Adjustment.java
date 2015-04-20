import java.math.BigDecimal;

public class Adjustment {
	
	private String name;
	private BigDecimal amountPerSemester;
	private AdjustmentKind category; 

	public Adjustment() {
		
	}
	
	public Adjustment(String name, BigDecimal amountPerSemester, AdjustmentKind category) {
		
		this.name = name;
		this.amountPerSemester = amountPerSemester;
		this.category = category;
	}
	
	public String getName() {
	return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public BigDecimal getAmountPerSemester() {
		return amountPerSemester;
	}
	
	public void setAmountPerSemester(BigDecimal amountPerSemester) {
		this.amountPerSemester = amountPerSemester;
	}
	
	public AdjustmentKind getCategory() {
		return category;
	}
	
	public void setCategory(AdjustmentKind category) {
		this.category = category;
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
