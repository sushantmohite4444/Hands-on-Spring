package Springpract.Controller;

import java.beans.Transient;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexControl {

	@RequestMapping("/")
	public String index(Model m) {
		
		m.addAttribute("name","sush");
		return "index";
		
	}
	
	@Transactional
	public void transactional() {
		
	}
}
