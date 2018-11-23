package webproject.service.member;

import org.springframework.stereotype.Service;

import webproject.entity.member.AddRoom;
import webproject.entity.member.Member;
import webproject.entity.member.MemberImage;

@Service

public interface MemberService {
	void mregister(Member member);
	void addroom(AddRoom addroom);
	void upload(MemberImage image);
	void upload_mainImg(MemberImage image);

}
