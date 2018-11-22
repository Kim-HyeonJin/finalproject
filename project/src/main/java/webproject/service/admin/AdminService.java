package webproject.service.admin;

import java.security.NoSuchAlgorithmException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import webproject.entity.admin.Admin;

@Service
public interface AdminService {
	void aregister(Admin admin) throws NoSuchAlgorithmException;
	boolean login(Admin admin) throws NoSuchAlgorithmException;
	
}
