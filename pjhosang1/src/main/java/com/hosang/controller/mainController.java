package com.hosang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;




@Controller
@RequestMapping("/main/*")
@Slf4j
public class mainController {
	
	
	@GetMapping("/login")
	public String login(Model model) {
		log.info(" 로그인 페이지 ");
		return "login";
	}
	@GetMapping("/signup")
	public String signup(Model model) {
		log.info(" 로그인 ");
		return "signup";
	}
	@GetMapping("/newuser")
	public String newuser(Model model) {
		log.info(" 회원가입 ");
		return "newuser";
	}

}
