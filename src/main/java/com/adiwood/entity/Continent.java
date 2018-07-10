package com.adiwood.entity;

import java.util.HashSet;
import java.util.Set;

public class Continent {
	
	private String cid;
	private String cname;
	private Set states = new HashSet(0);
	
	
	public Continent() {
		super();
	}

	public Continent(String cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}

	public Continent(String cid, String cname, Set states) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.states = states;
	}

	
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}

	public Set getStates() {
		return states;
	}
	public void setStates(Set states) {
		this.states = states;
	}
	
	
	

}
