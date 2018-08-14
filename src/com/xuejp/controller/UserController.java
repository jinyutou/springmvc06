package com.xuejp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.xuejp.po.UserInfo;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/add1")
	public String add(HttpServletRequest request){
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		System.out.println(userName+"=====新增用户信息======="+password);
		request.setAttribute("user", userName+"=====新增用户信息======="+password);
		return "user_add1";
	}

	@RequestMapping("/add2")
	public ModelAndView add2(){
		ModelAndView mav = new ModelAndView("user_add2");
		mav.addObject("name", "张三");
		return mav;
	}

	@RequestMapping("/add3")
	public String add3(Model model){
		model.addAttribute("userName", "李四");
		return "user_add3";
	}

	@RequestMapping("/add4")
	public String add4(Map map){
		map.put("userName", "历史");
		return "user_add4";
	}
}
