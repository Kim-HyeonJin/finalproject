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
		String origin = admin.getAdmin_pw();
		System.out.println("origin = " + origin);
		String salt = "homekang";
		String result = encrypt(origin);
		System.out.println("result =" + result);
		admin.setAdmin_pw(result);
		System.out.println("admin = " +admin);
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
	
	
	//관리자 로그인 
//	@Override
//	public boolean login(Admin admin) {
//		String name = sqlSession.selectOne("login",admin);
//		System.out.println(name);
//		
//		
//		return false;
//	}
//	@Override
//	public boolean login(Admin admin, HttpSession session) {
//		boolean result = sqlSession.selectOne("login",admin);
//		System.out.println("실행");
//		
//		return result;
//	}
	@Override
	public boolean login(Admin admin) throws NoSuchAlgorithmException {
//		System.out.println("로그인실행");
//		String origin = admin.getAdmin_pw();
//		System.out.println("로그인 origin = " + origin);
//		String result = encrypt(origin);
//		System.out.println("로그인 result =" + result);
//		admin.setAdmin_pw(result);
//		System.out.println("admin = " +admin);
//		//여기까지 실행됨
		sqlSession.selectOne("login", admin);
		System.out.println("여기까지 실행완료");
		int num = sqlSession.selectOne("login",admin);
		System.out.println(num);
		
		if(num>0) {
			
			
			
			return true;
		}else {
			return false;
		}
			
		
			
		
//		return num>0;
//		boolean result = a
		/*int login = sqlSession.selectOne("login", admin.getAdmin_id());//반환형태가 admin
		int password = sqlSession.selectOne("password",admin.getAdmin_pw()); */
		/*if(login>0&&password>0) {
			return true;
			
		}else {
			System.out.println("여기까지오");
			return false;
			
		}*/
	}



}

