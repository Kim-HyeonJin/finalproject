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
	void upload(MemberImage image);
	void upload_mainImg(MemberImage image);
	String nameok(String name);
	List<MemberImage> loadImage();
	MemberImage findImage(int image_writer);
	int count(int image_writer);
	void deleteImage(int image_writer);
}
