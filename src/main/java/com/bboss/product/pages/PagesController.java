package com.bboss.product.pages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bboss.product.service.interfaces.CharacterService;

@Controller
@RequestMapping("/pages")
public class PagesController {
	
	@RequestMapping("/index") 
    public ModelAndView indexPage() {
   	 ModelAndView model=new ModelAndView();
   	 model.setViewName("index");
   	 return model;
    }
	@RequestMapping("/opreation") 
    public ModelAndView opreationPage() {
   	 ModelAndView model=new ModelAndView();
   	 model.setViewName("opreation");
   	 return model;
    }
}
