package com.mengyu.bean;

public class Mo {
	private int id;
	private String name;
	private String docter;
	private String time;
	private int timelong;
	private String type;
	private int year;
	private String place;
	private int sid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDocter() {
		return docter;
	}

	public void setDocter(String docter) {
		this.docter = docter;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getTimelong() {
		return timelong;
	}

	public void setTimelong(int timelong) {
		this.timelong = timelong;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	@Override
	public String toString() {
		return "Mo [id=" + id + ", name=" + name + ", docter=" + docter + ", time=" + time + ", timelong=" + timelong
				+ ", type=" + type + ", year=" + year + ", place=" + place + ", sid=" + sid + "]";
	}

	public Mo(int id, String name, String docter, String time, int timelong, String type, int year, String place,
			int sid) {
		super();
		this.id = id;
		this.name = name;
		this.docter = docter;
		this.time = time;
		this.timelong = timelong;
		this.type = type;
		this.year = year;
		this.place = place;
		this.sid = sid;
	}

	public Mo() {
		super();
	}

}
