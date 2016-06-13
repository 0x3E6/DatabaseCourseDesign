package model;

public class ProductInfo {
	private String ProdID;
	private String ProdName;
	private double ProdUnitPrice;
	private double ProdCost;
	private String ProdDesc;
	private String ProdHouseID;
	public ProductInfo(String prodID) {
		super();
		ProdID = prodID;
	}
	public String getProdID() {
		return ProdID;
	}
	public void setProdID(String prodID) {
		ProdID = prodID;
	}
	public String getProdName() {
		return ProdName;
	}
	public void setProdName(String prodName) {
		ProdName = prodName;
	}
	public double getProdUnitPrice() {
		return ProdUnitPrice;
	}
	public void setProdUnitPrice(double prodUnitPrice) {
		ProdUnitPrice = prodUnitPrice;
	}
	public double getProdCost() {
		return ProdCost;
	}
	public void setProdCost(double prodCost) {
		ProdCost = prodCost;
	}
	public String getProdDesc() {
		return ProdDesc;
	}
	public void setProdDesc(String prodDesc) {
		ProdDesc = prodDesc;
	}
	public String getProdHouseID() {
		return ProdHouseID;
	}
	public void setProdHouseID(String prodHouseID) {
		ProdHouseID = prodHouseID;
	}

}
