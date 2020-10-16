package com.dto;

public class BrandDTO {
	private int bnum;
	private String brand_eng;
	private String brand_kr;
	private int byear;
	private String bcontry;
	
	
	public BrandDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BrandDTO(int bnum, String brand_eng, String brand_kr, int byear, String bcontry) {
		super();
		this.bnum = bnum;
		this.brand_eng = brand_eng;
		this.brand_kr = brand_kr;
		this.byear = byear;
		this.bcontry = bcontry;
	}
	public int getBnum() {
		return bnum;
	}
	public void setBnum(int bnum) {
		this.bnum = bnum;
	}
	public String getBrand_eng() {
		return brand_eng;
	}
	public void setBrand_eng(String brand_eng) {
		this.brand_eng = brand_eng;
	}
	public String getBrand_kr() {
		return brand_kr;
	}
	public void setBrand_kr(String brand_kr) {
		this.brand_kr = brand_kr;
	}
	public int getByear() {
		return byear;
	}
	public void setByear(int byear) {
		this.byear = byear;
	}
	public String getBcontry() {
		return bcontry;
	}
	public void setBcontry(String bcontry) {
		this.bcontry = bcontry;
	}
	@Override
	public String toString() {
		return "BrandDTO [bnum=" + bnum + ", brand_eng=" + brand_eng + ", brand_kr=" + brand_kr + ", byear=" + byear
				+ ", bcontry=" + bcontry + "]";
	}
	
	
}
