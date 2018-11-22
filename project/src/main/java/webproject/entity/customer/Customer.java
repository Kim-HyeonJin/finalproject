package webproject.entity.customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor @Builder
public class Customer {
	private String id;
	private String nick;
	private String password;
	private String tel;
	private int point = 0;
	private int status = 0;
	private String joinDate;
	private String grade;
	
}
