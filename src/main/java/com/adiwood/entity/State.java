package com.adiwood.entity;

public class State {
	
	private String sid;
	private Continent continent;
	private String sname;
	
	
	public State() {
		super();
	}

	public State(String sid, Continent continent, String sname) {
		super();
		this.sid = sid;
		this.continent = continent;
		this.sname = sname;
	}
	

	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}

	public Continent getContinent() {
		return continent;
	}
	public void setContinent(Continent continent) {
		this.continent = continent;
	}

	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}

}
