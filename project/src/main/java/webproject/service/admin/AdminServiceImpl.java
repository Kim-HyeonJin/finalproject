package webproject.service.admin;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import webproject.entity.admin.Admin;
import webproject.service.password.EncryptService;

/**
 * 관리자 페이지 서비스
 * 
 * @author 강대훈
 *
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private SqlSession sqlSession;
	
	@Autowired
	private EncryptService encryptService;
	Logger log = LoggerFactory.getLogger(getClass());
	
	
	// 관리자  계정 생성
	@Override
	public void aregister(Admin admin) throws NoSuchAlgorithmException {
//		[1] 입력된 패스워드 값 받아옴
		String origin = admin.getAdmin_pw();
//		[2] 암호화 작업 
		String result = encrypt(origin);
//		[3] 암호화된 패스워드 설정
		admin.setAdmin_pw(result);
//		[4] 암호화된 패스워드로 insert 
		sqlSession.insert("aregister", admin);
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
	
	//관리자로그인
	@Override
	public boolean login(Admin admin) throws NoSuchAlgorithmException {
//		[1] JSP 파일에서 입력된 패스워드를 받아옴
		String origin = admin.getAdmin_pw();
		
//		[2]받아온 패스워드를 암호화 하는 작업 -> 위에 암호화 코드있음 
		String result = encrypt(origin);
		
//		[3] 암호화한 코드를 패스워드로 설정 
		admin.setAdmin_pw(result);

//		[4] 1 또는 0으로 결과값을 받아와서 처리 
		int num = sqlSession.selectOne("login",admin);
		
//		[5] 아이디 있을경우 0이상이 나오고 없을경우 0이 나오므로 결과에 따라 처리
		if(num>0) {
			
			
			return true;
		}else {
			
			return false;
		}
			
	}
}

