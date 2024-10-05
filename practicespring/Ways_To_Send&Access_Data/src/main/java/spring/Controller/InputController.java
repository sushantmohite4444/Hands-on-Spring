package spring.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.bytebuddy.matcher.ModifierMatcher.Mode;
import spring.mvcModel.Student;
import spring.mvcservices.studentservice;

@Controller
//@RequestMapping("/globalmap")
public class InputController {
	
	// model for all controller
	@ModelAttribute
	public void commondetaforallhandler(Model m) {
		m.addAttribute("name","king of kings");
	}

	@RequestMapping("/input")
	public String views() {

		return "input";

	}
	
	

	
	
	
	//****using HttpServletRequest****
	
//	@RequestMapping(path="/sendfd",method=RequestMethod.POST )
//	public String getdata(HttpServletRequest h){	
//	String s=	h.getParameter("email");
//	String p=	h.getParameter("pass");
//		
//	System.out.println(s + p);
//	
//	return "" ;
//
//	}
	
	
	//****Using @RequestParam(name = "email", required = true)****

//	@RequestMapping(path = "/sendfd", method = RequestMethod.POST)
//	public String getdata(@RequestParam(name = "email", required = true) String email,
//			@RequestParam("pass") String password, Model m)
//
//	{
//
//		System.out.println(email + password);
//
//		m.addAttribute("email", email);
//		m.addAttribute("pass", password);
//		return "show";
//
//	}

	
	

	@Autowired
	private studentservice Studentservice;

	//**** using  model @ModelAttribute("std") Student std, Model m ****
	@RequestMapping(path = "/sendfd", method = RequestMethod.POST)
	public String getdata(@ModelAttribute("std") Student std, Model m,BindingResult r)
	{
		//m.addAttribute("std", std);
		
		if(r.hasErrors()) {
			m.addAttribute("visibility", "true");
			return "redirect:/input";
		}

		this.Studentservice.createstudent(std);
  
		return "redirect:/getdata";
	}
	
	//****using model ****
	
	@RequestMapping("/getdata")
	public String getalldata(Model m) {
		
		List<Student> std=this.Studentservice.getlist();
		if(std==null) {
			System.out.println("best");
		}
		m.addAttribute("m",std);
		System.out.println(std.toString() );
		return "show";
		
	}
}
