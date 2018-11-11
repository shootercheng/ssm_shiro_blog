package com.luoxiao.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author chengdu
 */

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public void register(){
		
	}
}
