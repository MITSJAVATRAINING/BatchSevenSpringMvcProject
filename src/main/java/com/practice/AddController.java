package com.practice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	@RequestMapping("add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		int t1 = Integer.parseInt(request.getParameter("t1"));
		int t2 = Integer.parseInt(request.getParameter("t2"));
		
		int sum = t1 + t2;
		
		ModelAndView mvc = new ModelAndView();
		mvc.addObject("result", sum);
		mvc.setViewName("display.jsp");
		
		return mvc;
	}

}
