 	package spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController {
	
	@RequestMapping("/home")
	public String views(Model m) {
		
		
		m.addAttribute("name", "sushant");
		
		return "index";
		
	}
	
	
	
	@RequestMapping("modelview")
	public ModelAndView mav() {
		
		ModelAndView mav =new ModelAndView();
		mav.addObject("name","king");
		mav.setViewName("modelandview");
		
		
		return mav;
		
	}
	
	

}
