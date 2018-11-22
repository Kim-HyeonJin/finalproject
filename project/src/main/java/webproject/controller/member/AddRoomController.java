package webproject.controller.member;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import webproject.entity.member.AddRoom;
import webproject.entity.member.MemberImage;
import webproject.service.member.MemberService;

/**
 * 객실등록
 * @author 김현진
 *
 */
@Controller
public class AddRoomController {

	@Autowired
	private MemberService memberservice;
	@Autowired
	private HttpSession session;
	
//	객실정보 등록
	@PostMapping("/addroom")
	public String addroom(@ModelAttribute AddRoom addroom) {
		memberservice.addroom(addroom);
		return "redirect:/home_main";
	}
	
	@GetMapping("/addroom")
	public String addroom() {
		
		return "addroom";
	}
	
//	이미지 업로드
	@PostMapping("/addimage")
	public String uploadImage(@ModelAttribute MemberImage image, MultipartHttpServletRequest mRequest) throws IllegalStateException, IOException {
		MultiValueMap<String, MultipartFile> map = mRequest.getMultiFileMap();
		for(String key : map.keySet()) {
//			System.out.println("key : "+key);		//테스트 코드
			
			
			File root = new File("D:/uploadImage");
			if(!root.exists())	root.mkdirs();
			
			File target;
			List<MultipartFile> list = map.get(key);
			for(MultipartFile file : list) {
//				이미지 DB저장을 위해 정보 생성
				String fname = file.getOriginalFilename();
				Long size = file.getSize();
				String rname = UUID.randomUUID().toString();
				
//				entity 등록
				image.setImage_location(key);
				image.setImage_fname(fname);
				image.setImage_size(size);
				image.setImage_rname(rname);
				image.setImage_writer(1234567890);
				
//				파일저장
				target = new File(root, rname);
				file.transferTo(target);
				memberservice.upload(image);
				
//				테스트 코드
//				System.out.println("file : "+file);
//				System.out.println("fileOrigin : "+file.getOriginalFilename());
			}
		}
		return "redirect:/addroom";
	}

	@GetMapping("/addimage")
	public String uploadImage() {
		return "redirect:/addroom";
	}
	
}
