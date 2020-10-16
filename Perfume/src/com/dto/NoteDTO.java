package com.dto;

public class NoteDTO {
	
	private int pnum;
	private String single;
	private String topnote;
	private String middlenote;
	private String basenote;
	public NoteDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NoteDTO(int pnum, String single, String topnote, String middlenote, String basenote) {
		super();
		this.pnum = pnum;
		this.single = single;
		this.topnote = topnote;
		this.middlenote = middlenote;
		this.basenote = basenote;
	}
	public int getPnum() {
		return pnum;
	}
	public void setPnum(int pnum) {
		this.pnum = pnum;
	}
	public String getSingle() {
		return single;
	}
	public void setSingle(String single) {
		this.single = single;
	}
	public String getTopnote() {
		return topnote;
	}
	public void setTopnote(String topnote) {
		this.topnote = topnote;
	}
	public String getMiddlenote() {
		return middlenote;
	}
	public void setMiddlenote(String middlenote) {
		this.middlenote = middlenote;
	}
	public String getBasenote() {
		return basenote;
	}
	public void setBasenote(String basenote) {
		this.basenote = basenote;
	}
	@Override
	public String toString() {
		return "NoteDTO [pnum=" + pnum + ", single=" + single + ", topnote=" + topnote + ", middlenote=" + middlenote
				+ ", basenote=" + basenote + "]";
	}
	
}
