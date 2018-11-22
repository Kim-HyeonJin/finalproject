package webproject.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 회원사 - 정보확인
 * @author 김현진
 *
 */
@Controller
public class CheckInfo {
	
	@GetMapping("/member/checkinfo")
	public String checkinfo() {
		
		return "/member/checkinfo";
	}
	
}
