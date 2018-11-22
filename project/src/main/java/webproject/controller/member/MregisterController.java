package webproject.controller.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import webproject.entity.member.Member;
import webproject.service.member.MemberService;


@Controller
public class MregisterController {
	

	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/member_register")
	public void mregister() {
		System.out.println("get방식");
	}
	//회원사 등록
	@PostMapping("/member_register")
	public String mrigister(@ModelAttribute Member member) {
		System.out.println("회원사 등록 : " + member);
		memberService.mregister(member);
		return "/member_register";
	}
	
	
	@GetMapping("/member_login")
	public void member_login() {
		
	}

	//로그인긔능
//	@PostMapping("/member_login")
//	public String memeber() {
//	}
	
}
