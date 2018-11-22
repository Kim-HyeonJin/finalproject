package webproject.entity.member;

import org.springframework.web.multipart.MultipartFile;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author 김현진
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddRoom {
	private int addroom_no;							//등록번호
	private String addroom_roomname;		//객실명
	private int addroom_roomcount;				//동일한 등급의 객실수
	private int addroom_limitperson;			//객실 수용가능 인원
	private int addroom_timeprice;				//대실요금
	private int addroom_dateprice;				//숙박요금
	private String addroom_info;					//객실정보
	private String addroom_reg;					//객실등록일
	private int addroom_settime;					//대실이용시간
	private String addroom_entrytime;			//숙박입실가능시간
	private String addroom_exittime;			//숙박퇴실시간
	
	private MultipartFile image;					//이미지 저장을 위한 변수
}
