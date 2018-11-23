package webproject.entity.admin;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * 관리자: 회사소개 저장 클래스
 * @author user
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor @Builder
public class AdminIntro {
	private int intro_no;
	private String intro_title;
	private String intro_content;
}
