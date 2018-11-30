package webproject.entity.member;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberImage {
	private int image_no;					//이미지 번호
	private int image_writer;			//이미지 등록자(외래키 - mb_businessno)
	private String image_location;	//이미지 종류 확인용 (메인이미지 or 객실이미지)
	private String image_fname;		//이미지 원본파일명
	private String image_rname;		//이미지 파일명
	private Long image_size;			//이미지 크기
	private String image_reg;			//이미지 등록일
	private MultipartFile file;
}
