package com.mengyu.bean;
//注释
public class Status {
	private int sid;
	private String sname;

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

	@Override
	public String toString() {
		return "Status [sid=" + sid + ", sname=" + sname + "]";
	}

	public Status(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public Status() {
		super();
	}

}
