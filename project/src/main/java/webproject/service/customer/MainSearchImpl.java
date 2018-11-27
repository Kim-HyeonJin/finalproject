package webproject.service.customer;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("mainSearch")
public class MainSearchImpl implements MainSearch{
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<MainSearch> list(String keyword) {
		return sqlSession.selectList("searchlist",keyword);
		
	}


	
	
	
}
