package webproject.service.customer;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webproject.entity.customer.Customer;

/**
 * CustomerService의 기능을 구현하는 클래스
 * @author HWS
 *
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void insert(Customer joinInfo) {
		System.out.println("joinInfo = "+joinInfo);
		sqlSession.insert("insert", joinInfo);
		
	}

}
