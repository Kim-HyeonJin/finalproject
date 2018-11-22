package webproject.controller.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AroundSeach {
	
	@RequestMapping("aroundsearch")
	public String aroundsearch() {
		return "aroundsearch";
	}
}
