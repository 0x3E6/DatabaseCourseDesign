package model;

public class MaterialHouseInfo {
	private String MateHouseID;
	private String StaffID;
	private double MateHouseMstock;
	private double MateAmountNow;
	private double MateAmountLost;
	public MaterialHouseInfo(String mateHouseID) {
		super();
		MateHouseID = mateHouseID;
	}
	public String getMateHouseID() {
		return MateHouseID;
	}
	public void setMateHouseID(String mateHouseID) {
		MateHouseID = mateHouseID;
	}
	public String getStaffID() {
		return StaffID;
	}
	public void setStaffID(String staffID) {
		StaffID = staffID;
	}
	public double getMateHouseMstock() {
		return MateHouseMstock;
	}
	public void setMateHouseMstock(double mateHouseMstock) {
		MateHouseMstock = mateHouseMstock;
	}
	public double getMateAmountNow() {
		return MateAmountNow;
	}
	public void setMateAmountNow(double mateAmountNow) {
		MateAmountNow = mateAmountNow;
	}
	public double getMateAmountLost() {
		return MateAmountLost;
	}
	public void setMateAmountLost(double mateAmountLost) {
		MateAmountLost = mateAmountLost;
	}		
}
