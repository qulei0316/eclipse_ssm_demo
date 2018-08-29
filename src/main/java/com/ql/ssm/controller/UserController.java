package com.ql.ssm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ql.ssm.pojo.User;
import com.ql.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("/userShow")
	public String toIndex(HttpServletRequest request,Model model) {
		int userid = Integer.parseInt(request.getParameter("id"));
		User user = userService.getUserByid(userid);
		model.addAttribute("user",user);
		return "showUser";
	}
}
