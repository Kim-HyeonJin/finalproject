package webproject.entity.member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor 
@Builder
@NoArgsConstructor
public class Member {
	private int mb_businessno; //사업자번호
	private String mb_name;
	private String mb_pw;
	private String mb_ceo;
	private int mb_post;
	private String mb_addr1;
	private String mb_addr2;
	private String mb_phone;
	private String mb_hp;
	private String mb_type;
	private String mb_grade;
	private String mb_reg;
	
	
	
	
	
	
	
}
