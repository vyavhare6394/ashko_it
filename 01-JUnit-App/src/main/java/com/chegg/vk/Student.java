package com.chegg.vk;

public class Student {
	
	
	int sid;
	String sname;
	Integer sage;
	public Student(int sid, String sname, Integer sage) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Integer getSage() {
		return sage;
	}
	public void setSage(Integer sage) {
		this.sage = sage;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + "]";
	}

	
	

}
