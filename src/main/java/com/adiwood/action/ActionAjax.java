package com.adiwood.action;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;

@Controller
//@RequestMapping(value="test")
public class ActionAjax {
	
	@RequestMapping(value="ajax.do")
//	@ResponseBody
//	Using ResponseBody or RequestParam
	public ModelAndView test(String name){
		
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
		
		System.out.println("ActionAjax : "+name);
		
		
		Map<String, Object> model = new HashMap<String, Object>();	
		model.put("message", "thank you !");
		
		
		JSONObject object = new JSONObject();
		object.put("message", "hello");
		
		
//		return new ModelAndView("ajax.jsp", model);
		return new ModelAndView("ajax", model);
	}

}
