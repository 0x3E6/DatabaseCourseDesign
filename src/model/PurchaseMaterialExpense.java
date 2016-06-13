package model;

public class PurchaseMaterialExpense {
	
	private String ExpenseID;
	private String MateID;
	private String MateName;
	private double MateUnitPrice;
	private double MateAmount;
	private double MateToprice;
	private String BuyTime;
	private String StaffID;
	private String Memo;
	
	public PurchaseMaterialExpense(String expenseID) {
		super();
		ExpenseID = expenseID;
	}
	public String getExpenseID() {
		return ExpenseID;
	}
	public void setExpenseID(String expenseID) {
		ExpenseID = expenseID;
	}
	public String getMateID() {
		return MateID;
	}
	public void setMateID(String mateID) {
		MateID = mateID;
	}
	public String getMateName() {
		return MateName;
	}
	public void setMateName(String mateName) {
		MateName = mateName;
	}
	public double getMateUnitPrice() {
		return MateUnitPrice;
	}
	public void setMateUnitPrice(double mateUnitPrice) {
		MateUnitPrice = mateUnitPrice;
	}
	public double getMateAmount() {
		return MateAmount;
	}
	public void setMateAmount(double mateAmount) {
		MateAmount = mateAmount;
	}
	public double getMateToprice() {
		return MateToprice;
	}
	public void setMateToprice(double mateToprice) {
		MateToprice = mateToprice;
	}
	public String getBuyTime() {
		return BuyTime;
	}
	public void setBuyTime(String buyTime) {
		BuyTime = buyTime;
	}
	public String getStaffID() {
		return StaffID;
	}
	public void setStaffID(String staffID) {
		StaffID = staffID;
	}
	public String getMemo() {
		return Memo;
	}
	public void setMemo(String memo) {
		Memo = memo;
	}
	
	
}
