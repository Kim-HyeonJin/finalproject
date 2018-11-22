package webproject.controller.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	//메인
	@RequestMapping("/home_main")
	public String home() {
		
		return "/home_main";
	}
}
