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
	private int image_no;
	private int image_writer;
	private String image_location;
	private String image_fname;
	private String image_rname;
	private Long image_size;
	private String image_reg;
	private MultipartFile file;
}
