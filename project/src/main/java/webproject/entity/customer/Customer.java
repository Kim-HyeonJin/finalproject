package webproject.entity.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor @Builder
public class Customer {
	private String cs_id;
	private String cs_pw;
	private String cs_nick;
	private String cs_tel;
	private String cs_grade;
	private int cs_point;
	private String joinDate;
	private int status = 0;
	
}
