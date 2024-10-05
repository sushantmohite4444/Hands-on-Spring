package configPackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@Configuration
@ComponentScan({"Test"})
public class Configrationclass implements WebMvcConfigurer {
	
	 @Bean
	  public ViewResolver viewResolver() {
		 System.out.println("sldkfjsdfj");
	    InternalResourceViewResolver irv = new InternalResourceViewResolver();
	    irv.setPrefix("/WEB-INF/");
	    irv.setSuffix(".jsp");

	    return irv;

	  }  
	
	 

}
