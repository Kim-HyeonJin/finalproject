package webproject.service.customer;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface MainSearch {
	List<MainSearch> list(String keyword);
	
	
}
