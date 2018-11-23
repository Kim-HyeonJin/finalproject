package webproject.entity.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @Builder
@NoArgsConstructor
public class MainSearch {
	private int addroom_no;
	private String addroom_roomname;
	private String addroom_roomcount;
	private String addroom_limitperson;
	private String addroom_timeprice;
	private String addroom_dateprice;
	private String addroom_info;
	private String addroom_reg;
	private String addroom_settime;
	private String addroom_entrytime;
	private String addroom_exittime;
	private String addroom_mb_name;
	

	

}
