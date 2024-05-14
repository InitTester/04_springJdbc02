package com.portfolio.www.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.portfolio.www.service.JoinService;

@Controller
public class LoginController {
	
	@RequestMapping("/loginPage.do")
	public String loginPage() {
		return "login";
	}
	
//	@Autowired
//	private JoinService joinservice;
//	
//	@RequestMapping("/join.do")
//	public ModelAndView join(@RequestParam HashMap<String,String> params) {
//		
//		/* 회원가입 서비스를 통해 작동하고 반환된 값을 기준으로 JSP 파일에 msg 전달 */
//		
//		int result = joinservice.join(params);
//		
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("result",result);
//		
//		// 결과 값이 1이면,"회원가입 되었습니다.", 아니면 "실패"
//		mv.addObject("msg", result == 1 ? "회원가입 되었습니다." : "실패");
//		mv.setViewName("login");
//		
//		return mv;
//	}	
}
