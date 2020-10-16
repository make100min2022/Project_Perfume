package com.dto;

public class PdetailsDTO {
	private int pnum;
	private int ml;
	private int price;
	private String type;
	public PdetailsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PdetailsDTO(int pnum, int ml, int price, String type) {
		super();
		this.pnum = pnum;
		this.ml = ml;
		this.price = price;
		this.type = type;
	}
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	public int getMl() {
		return ml;
	}
	public void setMl(int ml) {
		this.ml = ml;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "PdetailsDTO [pnum=" + pnum + ", ml=" + ml + ", price=" + price + ", type=" + type + "]";
	}
	
}
