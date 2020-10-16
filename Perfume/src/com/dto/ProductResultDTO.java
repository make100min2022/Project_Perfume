package com.dto;

public class ProductResultDTO {
	private int pnum;
	private String bname_kr;
	private String bname_eng;
	private String pname;
	private String singleNote;
	private String topNote;
	private String middleNote;
	private String baseNote;
	public ProductResultDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductResultDTO(int pnum, String bname_kr, String bname_eng, String pname, String singleNote,
			String topNote, String middleNote, String baseNote) {
		super();
		this.pnum = pnum;
		this.bname_kr = bname_kr;
		this.bname_eng = bname_eng;
		this.pname = pname;
		this.singleNote = singleNote;
		this.topNote = topNote;
		this.middleNote = middleNote;
		this.baseNote = baseNote;
	}
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	public String getBname_kr() {
		return bname_kr;
	}
	public void setBname_kr(String bname_kr) {
		this.bname_kr = bname_kr;
	}
	public String getBname_eng() {
		return bname_eng;
	}
	public void setBname_eng(String bname_eng) {
		this.bname_eng = bname_eng;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getSingleNote() {
		return singleNote;
	}
	public void setSingleNote(String singleNote) {
		this.singleNote = singleNote;
	}
	public String getTopNote() {
		return topNote;
	}
	public void setTopNote(String topNote) {
		this.topNote = topNote;
	}
	public String getMiddleNote() {
		return middleNote;
	}
	public void setMiddleNote(String middleNote) {
		this.middleNote = middleNote;
	}
	public String getBaseNote() {
		return baseNote;
	}
	public void setBaseNote(String baseNote) {
		this.baseNote = baseNote;
	}
	@Override
	public String toString() {
		return "ProductResultDTO [pnum=" + pnum + ", bname_kr=" + bname_kr + ", bname_eng=" + bname_eng + ", pname="
				+ pname + ", singleNote=" + singleNote + ", topNote=" + topNote + ", middleNote=" + middleNote
				+ ", baseNote=" + baseNote + "]";
	}
	

}
