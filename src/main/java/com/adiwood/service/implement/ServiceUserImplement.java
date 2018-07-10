package com.adiwood.service.implement;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.adiwood.dao.MapperUser;
import com.adiwood.entity.Continent;
import com.adiwood.entity.EntityUser;
import com.adiwood.service.ServiceUser;

@Service("userService")
public class ServiceUserImplement implements ServiceUser {
	
	@Resource
	private MapperUser mapperUser;

	
	@Override
	public EntityUser getByName(String username) {
		
		return this.mapperUser.selectByName(username);
	}

//	@Override
//	public Continent getContinent() {
//		
//		return this.mapperUser.selectContinents();
//	}

}
