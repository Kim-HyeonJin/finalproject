package webproject.service.member;

import java.io.IOException;

import org.springframework.stereotype.Service;

import webproject.entity.admin.Admin;
import webproject.entity.member.AddRoom;
import webproject.entity.member.Member;
import webproject.entity.member.MemberImage;

@Service

public interface MemberService {
	void mregister(Member member);
	void addroom(AddRoom addroom);
	void upload(MemberImage image);


}
