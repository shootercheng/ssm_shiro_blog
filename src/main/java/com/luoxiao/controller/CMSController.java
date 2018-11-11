package com.luoxiao.controller;

import com.luoxiao.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luoxiao.service.UserService;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author losho
 *
 */
@Controller
@RequestMapping(value="/cms")
public class CMSController {

	@Autowired
	private UserService userService;


	/**
	 * 角色页面
	 * @return
	 */
	@RequestMapping(value="/permissionManage")
	public String toPermissionPage() {
		return "cms/permissionManage";
	}

	@RequestMapping(value="/userList")
	public String userList(){
		return "cms/userList";
	}

	@ResponseBody
	@RequestMapping(value="/AllUser")
	public List<User> getAllUser(){
		return userService.selectAll();
	}
	
}
