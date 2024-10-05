package spring.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.Models.User;
import spring.Services.UserService;

@Controller
public class Getinformation {
	
	@Autowired
	private UserService userService;
	
	
	

	@RequestMapping(value= "/validatehandler", method = RequestMethod.POST )
	public String logindate(@RequestParam("email") String r , @RequestParam("pass") String pass  ) {
		
		System.out.println(r + pass);
		return "";
		
	}

	
	@RequestMapping (path= "/savedata", method = RequestMethod.POST )
   public String Registerdate(@ModelAttribute ("user") @Validated  User user ) {
	
		System.out.println(user);
	   return "index";
		
	}
	
	

}
