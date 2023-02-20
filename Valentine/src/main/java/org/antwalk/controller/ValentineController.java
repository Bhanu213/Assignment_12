package org.antwalk.controller;

import org.antwalk.Dao.ValentineMapping;
import org.antwalk.model.Valentine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ValentineController {
	@RequestMapping("/")
	public ModelAndView valentineform() {
		ModelAndView m = new ModelAndView("valentineform");
		Valentine v = new Valentine();
		m.addObject("valentine",v);
		return m;
	}
	@RequestMapping("valentinedetails")
	public ModelAndView valentinedetails(@ModelAttribute("valentine") Valentine v) {
		ModelAndView m = new ModelAndView("valentinedetails");
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		ValentineMapping vp = (ValentineMapping) context.getBean("ValentineMapping");
		vp.create(v.getDate(),v.getGifts(), v.getLocation());
		m.addObject("valentine",v);
		return m;
	}
}
