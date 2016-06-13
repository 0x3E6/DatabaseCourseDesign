package edu.swu.model;

public class ProductLevel {
	private String RankID;
	private String RankName;
	private String MateID;
	private double MateCnosume;
	public ProductLevel(String rankID) {
		super();
		RankID = rankID;
	}
	public String getRankID() {
		return RankID;
	}
	public void setRankID(String rankID) {
		RankID = rankID;
	}
	public String getRankName() {
		return RankName;
	}
	public void setRankName(String rankName) {
		RankName = rankName;
	}
	public String getMateID() {
		return MateID;
	}
	public void setMateID(String mateID) {
		MateID = mateID;
	}
	public double getMateCnosume() {
		return MateCnosume;
	}
	public void setMateCnosume(double mateCnosume) {
		MateCnosume = mateCnosume;
	}
	
}
