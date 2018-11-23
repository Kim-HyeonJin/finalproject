package webproject.controller.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String main_list(Model model) {
		
		System.out.println(mainSearch.list());
		
		model.addAttribute("list", mainSearch.list());
		return "/main_list";
	}
	

}
