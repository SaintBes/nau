package com.ukrinmash.ukraine.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("user")
public class LoginController {

    public static final Logger log = Logger.getLogger(LoginController.class);

	@RequestMapping("/login")
	public String doLogin(){
		return "index";
	}
}
