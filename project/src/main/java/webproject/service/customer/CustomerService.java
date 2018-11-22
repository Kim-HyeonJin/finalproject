package webproject.service.customer;

import org.springframework.stereotype.Service;

import webproject.entity.customer.Customer;

/**
 * 회원의 DB관련 기능을 구현할 인터페이스
 * @author HWS
 *
 */
@Service
public interface CustomerService {
	void insert(Customer joinInfo);
}
