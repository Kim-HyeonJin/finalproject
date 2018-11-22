package webproject.service.password;

import java.security.NoSuchAlgorithmException;

import org.springframework.stereotype.Service;

@Service
public interface EncryptService {
	String encrypt(String origin) throws NoSuchAlgorithmException;
}
