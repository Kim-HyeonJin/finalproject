package webproject.entity.admin;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 관리자 등록
 * @author 강대훈
 *
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Admin {
	private String no;
	private String admin_id;
	private String admin_pw;
	
}
