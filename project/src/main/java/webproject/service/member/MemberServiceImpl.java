package webproject.service.member;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	Logger log = LoggerFactory.getLogger(getClass());
	
	//회원사 등록 요청 
	@Override
	public void mregister(Member member) throws NoSuchAlgorithmException {
		
//		[1] 입력된 패스워드 값 받아옴
		String origin = member.getMb_pw();
//		[2] 암호화 작업 
		String result = encrypt(origin);
//		[3] 암호화된 패스워드 설정
		member.setMb_pw(result);
//		[4] 암호화된 패스워드로 insert 
		sqlSession.insert("mregister", member);
		
				
	}

	@Override
	public void addroom(AddRoom addroom) {
		sqlSession.insert("addroom", addroom);
		
	}

	//객실이미지 업로드

	@Override
	public void upload(MemberImage image) {
//		System.out.println("serviceImpl 실행");	//테스트 코드
		sqlSession.insert("imageUpload", image);
	}

	//숙소 메인이미지
	@Override
	public void upload_mainImg(MemberImage image) {
		sqlSession.insert("imageUpload", image);
	}

	@Override
	public boolean login(Member member) throws NoSuchAlgorithmException {
		System.out.println("실행");
		
		String origin = member.getMb_pw();
		
		String result = encrypt(origin);
		
		member.setMb_pw(result);
		
		int num = sqlSession.selectOne("mlogin",member);
		System.out.println("결과값 num = " + num);
		
		if(num>0) {
			System.out.println("트루실행");
			return true;
		}else {
			System.out.println("펄스싫애");
			return true;			
		}
		
	}
	
	public String encrypt (String origin) throws NoSuchAlgorithmException {
//		SHA-256 암호화 알고리즘을 이용하여 단방향 암호화하여 출력
		
//		암호화 알고리즘 인스턴스 생성
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		
//		인스턴스에 origin을 byte 형태로 설정
		digest.update(origin.getBytes(/*MS949*/));
		
//		변환된 데이터를 받아보자
		byte[] data = digest.digest();
		
		log.debug("data = {}", Arrays.toString(data));
		log.debug("data.length = {}", data.length);
		
//		글자별로 변환한 뒤에 결과로 합산
		StringBuffer buffer = new StringBuffer();
		for(int i=0; i < data.length; i++) {
			int value = (data[i] & 0xff) + 0x100;
			buffer.append(Integer.toString(value, 16).substring(1));
		}
		
//		결과 출력
		log.debug("결과 : {}", buffer.toString().toUpperCase());
		log.debug("결과 크기 : {}", buffer.toString().length());
		
		return buffer.toString().toUpperCase();
	}
	
	
	
	
	





	

}
