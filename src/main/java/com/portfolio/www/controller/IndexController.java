package com.portfolio.www.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	private final static Logger log = LoggerFactory.getLogger(IndexController.class);
	
	public IndexController() {		
		// TODO Auto-generated constructor stub
		log.info("\n\n---------------------------04 pj start---------------------------\n\n");
	}
	
	@RequestMapping("/index.do")
	public String indexPage() {
		return "index";
	}
	
}