package com.adiwood.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.adiwood.dao.MapperUser;
import com.adiwood.entity.EntityUser;
import com.adiwood.service.ServiceUser;
import com.alibaba.fastjson.JSONObject;

@Controller
//@Scope("prototype")
//@RequestMapping("/user")
public class ActionUser {

	@Resource
	private MapperUser mapperUser;
	
	
	@RequestMapping("show")
	public String toIndex(HttpServletRequest request,Model model){
		
		String username = request.getParameter("username");
		
		EntityUser user = this.mapperUser.selectByName(username);
		
		model.addAttribute("user", user);
		
		return "show";
	}
	
	@RequestMapping(value="login.do")
	public ModelAndView login(HttpServletRequest request){
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		EntityUser user = this.mapperUser.selectByName(username);
//		EntityUser user = us.getByName(username);
		
		Map<String, Object> model = new HashMap<String, Object>();
		
		if(user != null){
			if(user.getPassword().equals(password)){
				
//				model.addAttribute("user", user);
//				
//				model.addAttribute("message", "login successfully");
				
				model.put("user", user);
				model.put("message", "login successfully");
				
				return new ModelAndView("show", model);
				
			}else{
//				model.addAttribute("message", "password wasn't correct");
				
				model.put("message", "password wasn't correct");
				
				return new ModelAndView("password", model);
			}
		}else{
//			model.addAttribute("message", "username doesn't exist");
			
			model.put("message", "username doesn't exist");
			
			return new ModelAndView("username", model);
		}
	}
	
//	@ResponseBody
//	@RequestMapping(value="ajax.do")
//	ResponseBody transfer response value into json format to client
//	RequestBody transfer request data into json object
/*	public ModelAndView ajaxTest(HttpServletRequest request , HttpServletResponse response) throws IOException{
//		HttpServletRequest request , HttpServletResponse response
		
		
		String username = request.getParameter("username");
		
		Map<String, Object> model = new HashMap<String, Object>();	
		model.put("message", "message from ajax");
		
		System.out.println("userrname is "+username);

		
//		List<EntityUser> list = new ArrayList<EntityUser>();
//		
//		EntityUser user1 = new EntityUser("adiwood", "ilovejp");
//		EntityUser user2 = new EntityUser("james", "ilovetw");
//		
//		list.add(user1);
//		list.add(user2);
		
		return new ModelAndView("ajax", model);
	}*/

}
