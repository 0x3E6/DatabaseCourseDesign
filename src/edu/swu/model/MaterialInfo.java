package edu.swu.model;


public class MaterialInfo {
	private String MateID;
	private String MateName;
	private double MateUnitPrice;
	private String MateSpec;
	private String MateHouseID;
	private String MateDesc;
	
	public MaterialInfo(String mateID) {
		super();
		MateID = mateID;
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
	public String getMateSpec() {
		return MateSpec;
	}
	public void setMateSpec(String mateSpec) {
		MateSpec = mateSpec;
	}
	public String getMateHouseID() {
		return MateHouseID;
	}
	public void setMateHouseID(String mateHouseID) {
		MateHouseID = mateHouseID;
	}
	public String getMateDesc() {
		return MateDesc;
	}
	public void setMateDesc(String mateDesc) {
		MateDesc = mateDesc;
	}
	
}
