package webproject.controller.customer;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import webproject.service.customer.MainSearch;

/**
 * 메인홈페이지 검색기능 만들곳
 * 
 * @author 강대훈
 *
 */
@Controller
public class MainSearchController {
	
	@Autowired
	private MainSearch mainSearch;
	
	@RequestMapping("/main_list")
	public String main_list(Model model, HttpServletRequest request, @ModelAttribute("searchkey") String searchkey) {
		String keyword = request.getParameter("searchkey");
		String keyword1 = request.getParameter("typekey");
		String keyword2 = request.getParameter("locationkey");
		System.out.println("검색창 = "+  keyword);
		System.out.println("구분 = " +  keyword1);
		System.out.println("지역 = " + keyword2);
		
		System.out.println("리스트키워드 ="+mainSearch.list(keyword));
		model.addAttribute("list", mainSearch.list(keyword));
		
		return "/main_list";
//		jsp에서 검색창에 입력한 값을 컨트롤러로 가져와서 like구문을 작성 
	
	}
	

}
