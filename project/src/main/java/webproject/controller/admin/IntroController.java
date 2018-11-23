package webproject.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 회사소개 메인 페이지
 * @author 김현진
 *
 */
@Controller
public class IntroController {
	
	@RequestMapping("/intro_main")
	public String intro() {
		return "intro_main";
	}
	
	
}
