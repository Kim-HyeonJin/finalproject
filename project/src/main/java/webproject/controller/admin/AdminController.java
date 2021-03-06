package webproject.controller.admin;

import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import webproject.entity.admin.Admin;
import webproject.entity.admin.AdminIntro;
import webproject.service.admin.AdminService;

@Controller
//@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	//관리자 계정생성
	@GetMapping("/admin/admin_account")
	public void adminaccount() {
		System.out.println("겟");
	}
	
	//관리자 계정 생성 등록
	@PostMapping("/admin/admin_account")
	public String admin_account(@ModelAttribute Admin admin) throws NoSuchAlgorithmException {
		adminService.aregister(admin);
		return "redirect:/home_main";
	}
	
	//이벤트
	@RequestMapping("/admin/admin_event")
	public void admin_event() {
		
	}
	
	//회원검색
	@GetMapping("/admin/admin_search")
	public void admin_search() {
		
	}
	
	//관리자 통계
	@GetMapping("/admin/admin_staticchart")
	public void admin_staticchart() {
		
	}
	
	//관리자 게시물관리
	@GetMapping("/admin/admin_notice")
	public void admin_notice() {
		
	}
	
	
	//판매자 등록요청
	@GetMapping("/admin/admin_request")
	public void admin_request() {
		
	}
	
	@GetMapping("/admin/admin_login")
	public void adminlogin() {
		
	}
	
	@PostMapping("/admin/admin_login")
	public String admin_login(@ModelAttribute Admin admin ,HttpSession session) throws NoSuchAlgorithmException {
//		[1] 불린 값으로 로그인 리턴값을 가져옴 
		boolean result = adminService.login(admin);

		if(result) {
			//세션설정
			session.setAttribute("adminsession",admin.getAdmin_id());
			return "redirect:/home_main";
		}else {
			//실패
//			return 실패창
		}
		return "redirect:/home_main"; // 나중에 지우고 
	}
//	관리자 회사소개 페이지에서 입력받은 data를 adminService에 전달
//	@RequestMapping(value="admin_company_intro", method= {RequestMethod.GET})
	@PostMapping("/admin/admin_company_intro")
	public String admin_company_intro(@ModelAttribute AdminIntro intro) {
		System.out.println("Intro = "+intro);
		if(intro.getIntro_title() != null && intro.getIntro_content() != null) {
			adminService.introRegister(intro);
			return "redirect:/home_main";
		}
		return "/admin/admin_company_intro";
	}
	
	@GetMapping("/admin/admin_company_intro")
	public String admin_company_intro() {
//		adminService.
		return "/admin/admin_company_intro";
	}
	// 세션이라는 객체가 존재한다.
//	세션이라는 객체에다 addAttribute를 해준다
//	만약 로그인이 성공하면 아이디값에다 아이디+세션값을 지정하고
//	jsp 에서 이 세션값이 존재하면 로그인성공한걸로 생각
//	그래서 if로 jstl로 처리 

	

}
