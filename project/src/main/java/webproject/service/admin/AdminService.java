package webproject.service.admin;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.springframework.stereotype.Service;

import webproject.entity.admin.Admin;
import webproject.entity.admin.AdminIntro;

@Service
public interface AdminService {
	void aregister(Admin admin) throws NoSuchAlgorithmException;
	boolean login(Admin admin) throws NoSuchAlgorithmException;
	void introRegister(AdminIntro intro);
	List<AdminIntro> introLoad();
}
