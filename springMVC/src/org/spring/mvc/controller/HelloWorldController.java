package org.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloWorldController extends AbstractController {

	
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		ModelAndView modelandview=new ModelAndView("HelloPage");
		modelandview.addObject("msg", "Hello User, welcome to Spring MVC framework");
		return modelandview;
	}
}
