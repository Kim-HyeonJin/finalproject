package webproject.controller.member;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import webproject.entity.member.Member;
import webproject.entity.member.MemberImage;
import webproject.service.member.MemberService;

/**
 * 회원사 - 정보확인 및 대표이미지 등록/수정
 * @author 김현진
 *
 */
@Controller
public class CheckInfoController {
	
	@Autowired
	private MemberService memberservice;
	@Autowired
	private HttpSession session;
	
	
//	대표 이미지 업로드
	@PostMapping("/member/upload_mainImg")
	public String uploadImage(@ModelAttribute MemberImage image, MultipartHttpServletRequest mRequest) throws IllegalStateException, IOException {
		
//		대표이미지의 기존데이터 확인
//		if(memberservice.count((int)session.getAttribute("mbId")) == 0) {
		if(memberservice.count(1234567890) == 0) {					//테스트 코드
			MultipartFile file = mRequest.getFile("main_image");
			String fname = file.getOriginalFilename();
			Long size = file.getSize();
			String rname = UUID.randomUUID().toString();
			
			image.setImage_location("main_image");
			image.setImage_fname(fname);
			image.setImage_size(size);
			image.setImage_rname(rname);
//			image.setImage_writer((int)session.getAttribute("mbId"));
			image.setImage_writer(1234567890);	//테스트 코드
			
//			//이미지 파일 저장
			File root = new File("D:/uploadImage");
			if(!root.exists())	root.mkdirs();
			
			File target = new File(root, rname);
			file.transferTo(target);
			
			memberservice.upload_mainImg(image);
			
			return "redirect:/member/checkinfo";
		}
		else {
//			기존데이터 존재할 경우 삭제 후 등록
//			memberservice.deleteImage((int)session.getAttribute("mbId"));
			memberservice.deleteImage(1234567890);	//테스트 코드
			
			MultipartFile file = mRequest.getFile("main_image");
			String fname = file.getOriginalFilename();
			Long size = file.getSize();
			String rname = UUID.randomUUID().toString();
			
			image.setImage_location("main_image");
			image.setImage_fname(fname);
			image.setImage_size(size);
			image.setImage_rname(rname);
//			image.setImage_writer((int)session.getAttribute("mbId"));
			image.setImage_writer(1234567890);	//테스트 코드
			
//			//이미지 파일 저장
			File root = new File("D:/uploadImage");
			if(!root.exists())	root.mkdirs();
			
			File target = new File(root, rname);
			file.transferTo(target);
			
			memberservice.upload_mainImg(image);
			
			return "redirect:/member/checkinfo";
		}
	}
	
	@GetMapping("/member/upload_mainImg")
	public String uploadImage() {
		return "/member/checkinfo";
	}
	
//	페이지 시작시 대표이미지 및 회원사 정보 호출 컨트롤러
	@PostMapping("/member/checkinfo")
	public String checkinfoPost(Model model) {
//		model.addAttribute("info", memberservice.callInfo((int)session.getAttribute("mbId")));
		model.addAttribute("info", memberservice.callInfo(1234567890));		//테스트 코드
		model.addAttribute("list", memberservice.loadImage());		
		return "/member/checkinfo";
	}
	
	@GetMapping("/member/checkinfo")
	public String checkinfoGet(Model model) {
//		model.addAttribute("info", memberservice.callInfo((int)session.getAttribute("mbId")));
		model.addAttribute("info", memberservice.callInfo(1234567890));		//테스트 코드
		model.addAttribute("list", memberservice.loadImage());		
		return "/member/checkinfo";
	}
	
//	이미지를 내보내는 컨트롤러
	@PostMapping("/member/checkinfo/main_image")
	@ResponseBody
	public ResponseEntity<ByteArrayResource> imagePost(@RequestParam int image_writer) throws IOException{
		MemberImage img = memberservice.findImage(image_writer);
		File target = new File("D:/uploadImage", img.getImage_rname());
		if(!target.exists()) throw new FileNotFoundException();
		
		byte[] by = FileUtils.readFileToByteArray(target);
		ByteArrayResource resource = new ByteArrayResource(by);
		
		return ResponseEntity.ok()
													.contentType(getImageType(img.getImage_fname()))
													.contentLength(img.getImage_size())
													.body(resource);
	}
	
	@GetMapping("/member/checkinfo/main_image")
	@ResponseBody
	public ResponseEntity<ByteArrayResource> imageGet(@RequestParam int image_writer) throws IOException{
		MemberImage img = memberservice.findImage(image_writer);
		File target = new File("D:/uploadImage", img.getImage_rname());
		if(!target.exists()) throw new FileNotFoundException();
		
		byte[] by = FileUtils.readFileToByteArray(target);
		ByteArrayResource resource = new ByteArrayResource(by);
		return ResponseEntity.ok()
													.contentType(getImageType(img.getImage_fname()))
													.contentLength(img.getImage_size())
													.body(resource);
	}
	
	public MediaType getImageType(String image_fname) {
		if(image_fname.endsWith(".jpg")) return MediaType.IMAGE_JPEG;
		if(image_fname.endsWith(".png")) return MediaType.IMAGE_PNG;
		if(image_fname.endsWith("gif")) return MediaType.IMAGE_GIF;
		return null;
	}
}
