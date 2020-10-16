package com.dto;

public class ProductDTO {
	private int pNum;
	private int bNum;
	private String pName;
	private int pNote;
	
	public ProductDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductDTO(int pNum, int bNum, String pName, int pNote) {
		super();
		this.pNum = pNum;
		this.bNum = bNum;
		this.pName = pName;
		this.pNote = pNote;
	}
	public int getpNum() {
		return pNum;
	}
	public void setpNum(int pNum) {
		this.pNum = pNum;
	}
	public int getbNum() {
		return bNum;
	}
	public void setbNum(int bNum) {
		this.bNum = bNum;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpNote() {
		return pNote;
	}
	public void setpNote(int pNote) {
		this.pNote = pNote;
	}
	@Override
	public String toString() {
		return "ProductDTO [pNum=" + pNum + ", bNum=" + bNum + ", pName=" + pName + ", pNote=" + pNote + "]";
	}
		
}
