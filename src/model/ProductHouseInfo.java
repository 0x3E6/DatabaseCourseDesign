package model;

public class ProductHouseInfo {
	private String ProdHouseID;
	private String StaffID;
	private String ProdID;
	private double ProdHouseMstock;
	private double ProdAmountNow;
	private double ProdAmountLost;
	public ProductHouseInfo(String prodHouseID) {
		super();
		ProdHouseID = prodHouseID;
	}
	public String getProdHouseID() {
		return ProdHouseID;
	}
	public void setProdHouseID(String prodHouseID) {
		ProdHouseID = prodHouseID;
	}
	public String getStaffID() {
		return StaffID;
	}
	public void setStaffID(String staffID) {
		StaffID = staffID;
	}
	public String getProdID() {
		return ProdID;
	}
	public void setProdID(String prodID) {
		ProdID = prodID;
	}
	public double getProdHouseMstock() {
		return ProdHouseMstock;
	}
	public void setProdHouseMstock(double prodHouseMstock) {
		ProdHouseMstock = prodHouseMstock;
	}
	public double getProdAmountNow() {
		return ProdAmountNow;
	}
	public void setProdAmountNow(double prodAmountNow) {
		ProdAmountNow = prodAmountNow;
	}
	public double getProdAmountLost() {
		return ProdAmountLost;
	}
	public void setProdAmountLost(double prodAmountLost) {
		ProdAmountLost = prodAmountLost;
	}
	
}
