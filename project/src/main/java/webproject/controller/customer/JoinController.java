package webproject.controller.customer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import webproject.entity.customer.Customer;
import webproject.service.customer.CustomerService;
/**
 * 회원가입 view와 연결하는 클래스 
 * @author HWS
 *
 */
@Controller
public class JoinController {
	
	@Autowired
	private CustomerService customerService;

	@RequestMapping("cs_jointos")
	public String cs_jointos(HttpServletRequest request) {
		String tos1 = request.getParameter("tos1");
		String tos2 = request.getParameter("tos2");
//		System.out.println(tos1);
//		System.out.println(tos2);
		if(tos1 != null && tos2 != null) {
			if(tos1.equals("true") && tos2.equals("true")) {
				return "cs_joininput";
			}
		}
		return "cs_jointos";
	}
	
	@RequestMapping("cs_joininput")
	public String cs_joininput(@ModelAttribute Customer joinInfo) {
//		System.out.println(joinInfo.getCs_id());
		if(joinInfo.getCs_id() != null) {
			customerService.insert(joinInfo);
			return "redirect:/home_main";
		}
		return "cs_joininput";
	}
	
	
	@GetMapping("/cs_login")
	public void cs_login() {
		
	}
}

