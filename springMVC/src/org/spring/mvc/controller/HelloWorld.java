package org.spring.mvc.controller;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorld {
  
	Logger log=Logger.getLogger(HelloWorld.class);
	
	@RequestMapping("/welcome")
	public ModelAndView sampleHello(){
		log.info("entered into sampleHello method");
		ModelAndView model=new ModelAndView("HelloPage");
		log.info(model.getStatus());
		model.addObject("msg", "This is from RequestMapping Annotation");
		log.info("returning model object");
		return model;
	}
}
