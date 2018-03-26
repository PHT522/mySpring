package kh.com.a;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller		// <- Annotation 주석문, 무조건 컨트롤러 오게함!!
public class HelloController {

	/*
	@RequestMapping("/hello")
	public ModelAndView hello() {
		
		System.out.println("HelloController hello");
		
		ModelAndView v = new ModelAndView();
		v.setViewName("/helloSpring");	// helloSpring.jsp를 찾는다 
		
		return v;
	}
	*/ 
	
	
	// .do 적용!!!
	@RequestMapping(value="login.do", method=RequestMethod.GET)   //value값 컨트롤러명칭
	public String login(Model model) {
		System.out.println("HelloController login.do");
		
		return "helloSpring";	// helloSpring.jsp로 간다!!
	}
	
	
}
