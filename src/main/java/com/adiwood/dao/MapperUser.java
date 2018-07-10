package com.adiwood.dao;

import com.adiwood.entity.EntityUser;

public interface MapperUser {
	
	public EntityUser selectByName(String username);
	
//	public Continent selectContinents();

}
