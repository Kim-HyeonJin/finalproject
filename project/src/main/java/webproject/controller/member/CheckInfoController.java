package webproject.controller.member;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import webproject.entity.member.MemberImage;
import webproject.service.member.MemberService;

/**
 * 회원사 - 정보확인
 * @author 김현진
 *
 */
@Controller
public class CheckInfoController {
	
	@Autowired
	MemberService memberservice;
	@Autowired
	private HttpSession session;
	@Autowired
	private ServletContext application;
	
//	객실 이미지 업로드
	@PostMapping("/member/upload_mainImg")
	public String uploadImage(@ModelAttribute MemberImage image, MultipartHttpServletRequest mRequest) throws IllegalStateException, IOException {
		MultipartFile file = mRequest.getFile("main_image");
		String fname = file.getOriginalFilename();
		Long size = file.getSize();
		String rname = UUID.randomUUID().toString();
		
		image.setImage_location("main_image");
		image.setImage_fname(fname);
		image.setImage_size(size);
		image.setImage_rname(rname);
//		image.setImage_writer((int)session.getAttribute("mbNmae"));
		image.setImage_writer(1234567890);	//테스트 코드
		
//		//이미지 파일 저장
		String path = application.getRealPath("/webapp/upload");	
		System.out.println(path);
		File root = new File(path);
		if(!root.exists())	root.mkdirs();
		
		File target = new File(root, rname);
		file.transferTo(target);
		
		memberservice.upload_mainImg(image);
		
		return "/member/checkinfo";
	}

	@GetMapping("/member/checkinfo")
	public String uploadImage() {
		return "/member/checkinfo";
	}
	
}
