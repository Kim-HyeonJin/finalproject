package webproject.service.member;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import webproject.entity.admin.Admin;
import webproject.entity.member.AddRoom;
import webproject.entity.member.Member;
import webproject.entity.member.MemberImage;
/**
 * 서비스 등록
 * @author 강대훈
 *
 */
@Service("memberService")
public class MemberServiceImpl implements MemberService{

	@Autowired
	private SqlSession sqlSession;
	
	//회원사 등록 요청 
	@Override
	public void mregister(Member member) {
		sqlSession.insert("mregister", member);
		
				
	}

	@Override
	public void addroom(AddRoom addroom) {
		sqlSession.insert("addroom", addroom);
	}

	@Override
	public void upload(MemberImage image) {
		System.out.println("serviceImpl 실행");
		sqlSession.insert("imageUpload", image);
	}
	
	
	
	
	





	

}
