package webproject.service.member;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.stereotype.Service;

import webproject.entity.member.AddRoom;
import webproject.entity.member.Member;
import webproject.entity.member.MemberImage;

@Service

public interface MemberService {
	void mregister(Member member) throws NoSuchAlgorithmException;
	boolean login(Member member) throws NoSuchAlgorithmException;
	void addroom(AddRoom addroom);
	void upload_mainImg(MemberImage image);
	String nameok(String name);
	
	//회원사 정보 호출 및 정보수정 서비스
	Member callInfo(int mbId);
	boolean existingpw(Member member) throws NoSuchAlgorithmException;	//기존 비밀번호 확인검사
	void changepw(Member member) throws NoSuchAlgorithmException;			//비밀번호 변경
	void change_phone(Member member);	//숙소전화번호 수정
	void change_hp(Member member);			//핸드폰 번호 수정
	
	
	
	//이미지 관련 서비스
	void upload(MemberImage image);		//이미지 업로드
	List<MemberImage> loadImage();		//전체 이미지 호출
	MemberImage findImage(int image_writer);	//특정 이미지 호출(로그인한 회원의 데이터)
	int count(int image_writer);				//기존 데이터 존재 유무 확인
	void deleteImage(int image_writer);	//기존 데이터 삭제
}
