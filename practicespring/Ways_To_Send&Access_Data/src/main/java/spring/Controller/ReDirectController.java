package spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReDirectController {
	
//	@RequestMapping("/one")
//	public String one() {
//		return "redirect:/two";
//		
//	}
//	
//	@RequestMapping("/two")
//	public String two() {
//		return "";
//	}
	
	
	
	@RequestMapping("/one")
	public RedirectView one() {
		
		RedirectView rv =new RedirectView();
		//rv.setUrl("two");
	rv.setUrl("https://www.google.com");
		
		return rv;
		
	}
	
	@RequestMapping("/two")
	public String two() {
		return "";
	}

	// httpssevletrequest response
	
}
