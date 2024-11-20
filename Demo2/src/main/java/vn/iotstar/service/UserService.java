package vn.iotstar.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import vn.iotstar.Entity.UserInfo;
import vn.iotstar.Repository.UserInfoRepository;

@Service
public record UserService(UserInfoRepository repo,
		PasswordEncoder passencode) {

	public String addUser(UserInfo user)
	{
		user.setPassword(passencode.encode(user.getPassword()));
		repo.save(user);
		return "Thêm user thành công!";
	}
	
}
