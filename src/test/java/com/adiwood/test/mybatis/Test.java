package com.adiwood.test.mybatis;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.adiwood.dao.MapperUser;
import com.adiwood.entity.EntityUser;
import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class Test {
	
	private static Logger logger = Logger.getLogger(Test.class);
	
	@Resource
	private MapperUser mapperUser = null;
	
	@org.junit.Test
	public void test1(){
		
		EntityUser user = mapperUser.selectByName("james");
		
		logger.info(JSON.toJSONString(user));
	}

}
