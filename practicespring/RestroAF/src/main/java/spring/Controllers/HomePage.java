package spring.Controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePage {
	
	@RequestMapping("/")
	public String Start() {
		return "index";
		
	}
	

}
