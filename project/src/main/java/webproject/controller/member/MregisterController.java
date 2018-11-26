package webproject.controller.member;

import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import webproject.entity.member.Member;
import webproject.service.member.MemberService;

/**
 * 회원사 기능
 * @author 강대훈
 * 2018-11-22 회원사 로그인기능 구현중....
 *
 */

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
	public String mrigister(@ModelAttribute Member member) throws NoSuchAlgorithmException {
		System.out.println("회원사 등록 : " + member);
		memberService.mregister(member);
		return "redirect:/home_main";
	}
	
//	로그인기능
	
	@GetMapping("/member/member_login")
	public void member_login() {
		
	}

	@PostMapping("/member/member_login")
	public String memeber_login(@ModelAttribute Member member, HttpSession session) throws NoSuchAlgorithmException {
//		[1] 불린 값으로 로그인 리턴값을 가져옴 
		System.out.println("멤버아이디 = " + member.getMb_businessno());
		
		
		String name = member.getMb_businessno();
		System.out.println("네임값 = " + name);
		
		String power = memberService.nameok(name);
		
		System.out.println("파워= "+ power);
		
		System.out.println("멤버 비밀번호 = " + member.getMb_pw());
		boolean result = memberService.login(member);
		System.out.println("컨트롤러 result = " + result);
		
		
		if(result) {
			//세션설정
			System.out.println("세션실행전");
			System.out.println("업체명 : "+member.getMb_name());
			session.setAttribute("mbId",member.getMb_businessno());
			session.setAttribute("mbName",power);
			System.out.println("세션실행 후");
			return "redirect:/home_main";
		}else {
			//실패
//			return 실패창
		}
		return "redirect:/home_main"; // 나중에 지우고 
	}
	
//	public String mbname(@ModelAttribute Member member) {
//		
//		String membername = memberService.nameok(member);
//		
//		return membername;
//	}
		
	
	
	
}
