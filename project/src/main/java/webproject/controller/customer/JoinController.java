package webproject.controller.customer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JoinController {

	@RequestMapping("jointos")
	public String jointos(HttpServletRequest request ) {
		String tos1 = request.getParameter("tos1");
		String tos2 = request.getParameter("tos2");
//		if()
		return "jointos";
	}
	
	@RequestMapping("joininput")
	public String joininput() {
		return "joininput";
	}
}
