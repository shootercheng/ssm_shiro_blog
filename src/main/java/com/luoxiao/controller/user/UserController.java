package com.luoxiao.controller.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luoxiao.service.UserService;

/**
 * @author chengdu
 */

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public void register(){
		
	}
	
	@ResponseBody
	@RequestMapping(value = "/checkUserName", method = RequestMethod.POST)
	public String checkUserName(String username) {
		Boolean b = userService.userIsExist(username);
		String result = b ? "true" : "false";
		return result;
	}
}
